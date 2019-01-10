/* tslint:disable max-line-length */
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { ActivatedRoute } from '@angular/router';
import { of } from 'rxjs';

import { JhipsterSampleApplicationTestModule } from '../../../test.module';
import { HCBTModelDetailComponent } from 'app/entities/hcbt-model/hcbt-model-detail.component';
import { HCBTModel } from 'app/shared/model/hcbt-model.model';

describe('Component Tests', () => {
    describe('HCBTModel Management Detail Component', () => {
        let comp: HCBTModelDetailComponent;
        let fixture: ComponentFixture<HCBTModelDetailComponent>;
        const route = ({ data: of({ hCBTModel: new HCBTModel(123) }) } as any) as ActivatedRoute;

        beforeEach(() => {
            TestBed.configureTestingModule({
                imports: [JhipsterSampleApplicationTestModule],
                declarations: [HCBTModelDetailComponent],
                providers: [{ provide: ActivatedRoute, useValue: route }]
            })
                .overrideTemplate(HCBTModelDetailComponent, '')
                .compileComponents();
            fixture = TestBed.createComponent(HCBTModelDetailComponent);
            comp = fixture.componentInstance;
        });

        describe('OnInit', () => {
            it('Should call load all on init', () => {
                // GIVEN

                // WHEN
                comp.ngOnInit();

                // THEN
                expect(comp.hCBTModel).toEqual(jasmine.objectContaining({ id: 123 }));
            });
        });
    });
});
