import { Component, OnInit, EventEmitter, Output } from '@angular/core';
import { Router }            from '@angular/router';
import { FormGroup, FormBuilder, FormControl } from '@angular/forms';
import { Http, Response, Headers } from '@angular/http';

@Component({
  moduleId: module.id,
  selector: 'search-db',
  templateUrl: 'search.component.html'
})
export class SearchComponent implements OnInit {
  
  searchForm = new FormGroup({
    name: new FormControl()
  });
  private http: Http;
  constellations = [];
  selected;
  selectedRow;
   
  @Output() notify: EventEmitter<string> = new EventEmitter<string>();
     
  constructor(private formBuilder: FormBuilder, private http: Http) {}
  
  ngOnInit() {
    this.searchForm = this.formBuilder.group({
      name: ''
    });
  }
    
  search() {
		console.log("searching...");

		var headers = new Headers(); 
		headers.append('Content-Type', 'application/json'); 

        var uri = './spring/webapi/constellations';
        if(this.searchForm.value.name){
            uri = uri + '?query=' + this.searchForm.value.name;
        }

		this.http.get(uri,
			{headers:headers}) 
			.subscribe(res => {
				this.constellations = res.json();
                console.log(this.constellations);
				this.notify.emit('result-display');
				console.log('notification sent');
			});		
		
		console.log("search finished.");	
		
	}

	changeConstellation(e:MouseEvent, abbr: any, i: any){
        console.log('in emit. i:' + i);
		this.selectedRow = i;
        var headers = new Headers();
		headers.append('Content-Type', 'application/json');
		this.http.get('./spring/webapi/constellations/' + abbr + '/stars/',
			{headers:headers})
			.subscribe(res => {
				this.selected = res.json();
				this.notify.emit('result-display');
				console.log('notification sent');
			});

		console.log("search finished.");
	}  
}

