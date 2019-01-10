/* tslint:disable max-line-length */
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { Observable, of } from 'rxjs';
import { HttpHeaders, HttpResponse } from '@angular/common/http';

import { JhipsterSampleApplicationTestModule } from '../../../test.module';
import { HCBTModelComponent } from 'app/entities/hcbt-model/hcbt-model.component';
import { HCBTModelService } from 'app/entities/hcbt-model/hcbt-model.service';
import { HCBTModel } from 'app/shared/model/hcbt-model.model';

describe('Component Tests', () => {
    describe('HCBTModel Management Component', () => {
        let comp: HCBTModelComponent;
        let fixture: ComponentFixture<HCBTModelComponent>;
        let service: HCBTModelService;

        beforeEach(() => {
            TestBed.configureTestingModule({
                imports: [JhipsterSampleApplicationTestModule],
                declarations: [HCBTModelComponent],
                providers: []
            })
                .overrideTemplate(HCBTModelComponent, '')
                .compileComponents();

            fixture = TestBed.createComponent(HCBTModelComponent);
            comp = fixture.componentInstance;
            service = fixture.debugElement.injector.get(HCBTModelService);
        });

        it('Should call load all on init', () => {
            // GIVEN
            const headers = new HttpHeaders().append('link', 'link;link');
            spyOn(service, 'query').and.returnValue(
                of(
                    new HttpResponse({
                        body: [new HCBTModel(123)],
                        headers
                    })
                )
            );

            // WHEN
            comp.ngOnInit();

            // THEN
            expect(service.query).toHaveBeenCalled();
            expect(comp.hCBTModels[0]).toEqual(jasmine.objectContaining({ id: 123 }));
        });
    });
});
