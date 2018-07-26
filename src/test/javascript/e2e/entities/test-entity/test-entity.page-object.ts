import { element, by, promise, ElementFinder } from 'protractor';

export class TestEntityComponentsPage {
    createButton = element(by.id('jh-create-entity'));
    title = element.all(by.css('jhi-test-entity div h2#page-heading span')).first();

    clickOnCreateButton(): promise.Promise<void> {
        return this.createButton.click();
    }

    getTitle(): any {
        return this.title.getText();
    }
}

export class TestEntityUpdatePage {
    pageTitle = element(by.id('jhi-test-entity-heading'));
    saveButton = element(by.id('save-entity'));
    cancelButton = element(by.id('cancel-save'));
    recordIdInput = element(by.id('field_recordId'));
    lableInput = element(by.id('field_lable'));
    titleInput = element(by.id('field_title'));
    urlInput = element(by.id('field_url'));
    showIconInput = element(by.id('field_showIcon'));
    iconInput = element(by.id('field_icon'));
    dividerInput = element(by.id('field_divider'));
    sortOrderInput = element(by.id('field_sortOrder'));
    typeInput = element(by.id('field_type'));
    productIdInput = element(by.id('field_productId'));
    userIdInput = element(by.id('field_userId'));

    getPageTitle() {
        return this.pageTitle.getText();
    }

    setRecordIdInput(recordId): promise.Promise<void> {
        return this.recordIdInput.sendKeys(recordId);
    }

    getRecordIdInput() {
        return this.recordIdInput.getAttribute('value');
    }

    setLableInput(lable): promise.Promise<void> {
        return this.lableInput.sendKeys(lable);
    }

    getLableInput() {
        return this.lableInput.getAttribute('value');
    }

    setTitleInput(title): promise.Promise<void> {
        return this.titleInput.sendKeys(title);
    }

    getTitleInput() {
        return this.titleInput.getAttribute('value');
    }

    setUrlInput(url): promise.Promise<void> {
        return this.urlInput.sendKeys(url);
    }

    getUrlInput() {
        return this.urlInput.getAttribute('value');
    }

    getShowIconInput() {
        return this.showIconInput;
    }
    setIconInput(icon): promise.Promise<void> {
        return this.iconInput.sendKeys(icon);
    }

    getIconInput() {
        return this.iconInput.getAttribute('value');
    }

    getDividerInput() {
        return this.dividerInput;
    }
    setSortOrderInput(sortOrder): promise.Promise<void> {
        return this.sortOrderInput.sendKeys(sortOrder);
    }

    getSortOrderInput() {
        return this.sortOrderInput.getAttribute('value');
    }

    setTypeInput(type): promise.Promise<void> {
        return this.typeInput.sendKeys(type);
    }

    getTypeInput() {
        return this.typeInput.getAttribute('value');
    }

    setProductIdInput(productId): promise.Promise<void> {
        return this.productIdInput.sendKeys(productId);
    }

    getProductIdInput() {
        return this.productIdInput.getAttribute('value');
    }

    setUserIdInput(userId): promise.Promise<void> {
        return this.userIdInput.sendKeys(userId);
    }

    getUserIdInput() {
        return this.userIdInput.getAttribute('value');
    }

    save(): promise.Promise<void> {
        return this.saveButton.click();
    }

    cancel(): promise.Promise<void> {
        return this.cancelButton.click();
    }

    getSaveButton(): ElementFinder {
        return this.saveButton;
    }
}
