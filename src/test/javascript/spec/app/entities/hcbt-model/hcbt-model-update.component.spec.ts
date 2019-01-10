/* tslint:disable max-line-length */
import { ComponentFixture, TestBed, fakeAsync, tick } from '@angular/core/testing';
import { HttpResponse } from '@angular/common/http';
import { Observable, of } from 'rxjs';

import { JhipsterSampleApplicationTestModule } from '../../../test.module';
import { HCBTModelUpdateComponent } from 'app/entities/hcbt-model/hcbt-model-update.component';
import { HCBTModelService } from 'app/entities/hcbt-model/hcbt-model.service';
import { HCBTModel } from 'app/shared/model/hcbt-model.model';

describe('Component Tests', () => {
    describe('HCBTModel Management Update Component', () => {
        let comp: HCBTModelUpdateComponent;
        let fixture: ComponentFixture<HCBTModelUpdateComponent>;
        let service: HCBTModelService;

        beforeEach(() => {
            TestBed.configureTestingModule({
                imports: [JhipsterSampleApplicationTestModule],
                declarations: [HCBTModelUpdateComponent]
            })
                .overrideTemplate(HCBTModelUpdateComponent, '')
                .compileComponents();

            fixture = TestBed.createComponent(HCBTModelUpdateComponent);
            comp = fixture.componentInstance;
            service = fixture.debugElement.injector.get(HCBTModelService);
        });

        describe('save', () => {
            it(
                'Should call update service on save for existing entity',
                fakeAsync(() => {
                    // GIVEN
                    const entity = new HCBTModel(123);
                    spyOn(service, 'update').and.returnValue(of(new HttpResponse({ body: entity })));
                    comp.hCBTModel = entity;
                    // WHEN
                    comp.save();
                    tick(); // simulate async

                    // THEN
                    expect(service.update).toHaveBeenCalledWith(entity);
                    expect(comp.isSaving).toEqual(false);
                })
            );

            it(
                'Should call create service on save for new entity',
                fakeAsync(() => {
                    // GIVEN
                    const entity = new HCBTModel();
                    spyOn(service, 'create').and.returnValue(of(new HttpResponse({ body: entity })));
                    comp.hCBTModel = entity;
                    // WHEN
                    comp.save();
                    tick(); // simulate async

                    // THEN
                    expect(service.create).toHaveBeenCalledWith(entity);
                    expect(comp.isSaving).toEqual(false);
                })
            );
        });
    });
});
