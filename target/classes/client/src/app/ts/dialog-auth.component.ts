import { Component, OnInit, Inject } from '@angular/core';
import { MAT_DIALOG_DATA } from  '@angular/material';
import { MatDialogRef } from  '@angular/material';

@Component({
  selector: 'app-dialog-auth',
  templateUrl: '../views/dialog-auth.component.html',
  styleUrls: ['../css/dialog-auth.component.css']
})
export class DialogAuthComponent implements OnInit {

  constructor(public DialogRef:  MatDialogRef<DialogAuthComponent>, @Inject(MAT_DIALOG_DATA) public data: string) { }

  ngOnInit() {
  }

}
