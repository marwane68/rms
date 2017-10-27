import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { HighSideBarComponent } from './high-side-bar.component';

describe('HighSideBarComponent', () => {
  let component: HighSideBarComponent;
  let fixture: ComponentFixture<HighSideBarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ HighSideBarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(HighSideBarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
