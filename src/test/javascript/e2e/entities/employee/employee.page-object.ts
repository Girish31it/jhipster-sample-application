import { element, by, ElementFinder } from 'protractor';

export class EmployeeComponentsPage {
    createButton = element(by.id('jh-create-entity'));
    deleteButtons = element.all(by.css('jhi-employee div table .btn-danger'));
    title = element.all(by.css('jhi-employee div h2#page-heading span')).first();

    async clickOnCreateButton() {
        await this.createButton.click();
    }

    async clickOnLastDeleteButton() {
        await this.deleteButtons.last().click();
    }

    async countDeleteButtons() {
        return this.deleteButtons.count();
    }

    async getTitle() {
        return this.title.getText();
    }
}

export class EmployeeUpdatePage {
    pageTitle = element(by.id('jhi-employee-heading'));
    saveButton = element(by.id('save-entity'));
    cancelButton = element(by.id('cancel-save'));
    recordIdInput = element(by.id('field_recordId'));
    fNameInput = element(by.id('field_fName'));
    lNameInput = element(by.id('field_lName'));
    genderInput = element(by.id('field_gender'));
    dobInput = element(by.id('field_dob'));
    deptInput = element(by.id('field_dept'));

    async getPageTitle() {
        return this.pageTitle.getText();
    }

    async setRecordIdInput(recordId) {
        await this.recordIdInput.sendKeys(recordId);
    }

    async getRecordIdInput() {
        return this.recordIdInput.getAttribute('value');
    }

    async setFNameInput(fName) {
        await this.fNameInput.sendKeys(fName);
    }

    async getFNameInput() {
        return this.fNameInput.getAttribute('value');
    }

    async setLNameInput(lName) {
        await this.lNameInput.sendKeys(lName);
    }

    async getLNameInput() {
        return this.lNameInput.getAttribute('value');
    }

    getGenderInput() {
        return this.genderInput;
    }
    async setDobInput(dob) {
        await this.dobInput.sendKeys(dob);
    }

    async getDobInput() {
        return this.dobInput.getAttribute('value');
    }

    async setDeptInput(dept) {
        await this.deptInput.sendKeys(dept);
    }

    async getDeptInput() {
        return this.deptInput.getAttribute('value');
    }

    async save() {
        await this.saveButton.click();
    }

    async cancel() {
        await this.cancelButton.click();
    }

    getSaveButton(): ElementFinder {
        return this.saveButton;
    }
}

export class EmployeeDeleteDialog {
    private dialogTitle = element(by.id('jhi-delete-employee-heading'));
    private confirmButton = element(by.id('jhi-confirm-delete-employee'));

    async getDialogTitle() {
        return this.dialogTitle.getText();
    }

    async clickOnConfirmButton() {
        await this.confirmButton.click();
    }
}
