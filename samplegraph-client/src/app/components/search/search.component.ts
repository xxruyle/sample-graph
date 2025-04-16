import { Component } from '@angular/core';

@Component({
  selector: 'app-search',
  imports: [],
  standalone: true,
  templateUrl: './search.component.html',
  styleUrl: './search.component.css'
})
export class SearchComponent {
  onSearchChange(event: any) : void {
    console.log('Search changed:', event.target.value);
  }
}
