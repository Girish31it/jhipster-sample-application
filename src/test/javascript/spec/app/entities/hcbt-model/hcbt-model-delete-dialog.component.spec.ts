/* tslint:disable max-line-length */
import { ComponentFixture, TestBed, inject, fakeAsync, tick } from '@angular/core/testing';
import { NgbActiveModal } from '@ng-bootstrap/ng-bootstrap';
import { Observable, of } from 'rxjs';
import { JhiEventManager } from 'ng-jhipster';

import { JhipsterSampleApplicationTestModule } from '../../../test.module';
import { HCBTModelDeleteDialogComponent } from 'app/entities/hcbt-model/hcbt-model-delete-dialog.component';
import { HCBTModelService } from 'app/entities/hcbt-model/hcbt-model.service';

describe('Component Tests', () => {
    describe('HCBTModel Management Delete Component', () => {
        let comp: HCBTModelDeleteDialogComponent;
        let fixture: ComponentFixture<HCBTModelDeleteDialogComponent>;
        let service: HCBTModelService;
        let mockEventManager: any;
        let mockActiveModal: any;

        beforeEach(() => {
            TestBed.configureTestingModule({
                imports: [JhipsterSampleApplicationTestModule],
                declarations: [HCBTModelDeleteDialogComponent]
            })
                .overrideTemplate(HCBTModelDeleteDialogComponent, '')
                .compileComponents();
            fixture = TestBed.createComponent(HCBTModelDeleteDialogComponent);
            comp = fixture.componentInstance;
            service = fixture.debugElement.injector.get(HCBTModelService);
            mockEventManager = fixture.debugElement.injector.get(JhiEventManager);
            mockActiveModal = fixture.debugElement.injector.get(NgbActiveModal);
        });

        describe('confirmDelete', () => {
            it('Should call delete service on confirmDelete', inject(
                [],
                fakeAsync(() => {
                    // GIVEN
                    spyOn(service, 'delete').and.returnValue(of({}));

                    // WHEN
                    comp.confirmDelete(123);
                    tick();

                    // THEN
                    expect(service.delete).toHaveBeenCalledWith(123);
                    expect(mockActiveModal.dismissSpy).toHaveBeenCalled();
                    expect(mockEventManager.broadcastSpy).toHaveBeenCalled();
                })
            ));
        });
    });
});
