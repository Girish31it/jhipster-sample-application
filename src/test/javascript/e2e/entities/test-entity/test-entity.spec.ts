import { browser } from 'protractor';
import { NavBarPage } from './../../page-objects/jhi-page-objects';
import { TestEntityComponentsPage, TestEntityUpdatePage } from './test-entity.page-object';

describe('TestEntity e2e test', () => {
    let navBarPage: NavBarPage;
    let testEntityUpdatePage: TestEntityUpdatePage;
    let testEntityComponentsPage: TestEntityComponentsPage;

    beforeAll(() => {
        browser.get('/');
        browser.waitForAngular();
        navBarPage = new NavBarPage();
        navBarPage.getSignInPage().autoSignInUsing('admin', 'admin');
        browser.waitForAngular();
    });

    it('should load TestEntities', () => {
        navBarPage.goToEntity('test-entity');
        testEntityComponentsPage = new TestEntityComponentsPage();
        expect(testEntityComponentsPage.getTitle()).toMatch(/Test Entities/);
    });

    it('should load create TestEntity page', () => {
        testEntityComponentsPage.clickOnCreateButton();
        testEntityUpdatePage = new TestEntityUpdatePage();
        expect(testEntityUpdatePage.getPageTitle()).toMatch(/Create or edit a Test Entity/);
        testEntityUpdatePage.cancel();
    });

    it('should create and save TestEntities', () => {
        testEntityComponentsPage.clickOnCreateButton();
        testEntityUpdatePage.setRecordIdInput('5');
        expect(testEntityUpdatePage.getRecordIdInput()).toMatch('5');
        testEntityUpdatePage.setLableInput('lable');
        expect(testEntityUpdatePage.getLableInput()).toMatch('lable');
        testEntityUpdatePage.setTitleInput('title');
        expect(testEntityUpdatePage.getTitleInput()).toMatch('title');
        testEntityUpdatePage.setUrlInput('url');
        expect(testEntityUpdatePage.getUrlInput()).toMatch('url');
        testEntityUpdatePage
            .getShowIconInput()
            .isSelected()
            .then(selected => {
                if (selected) {
                    testEntityUpdatePage.getShowIconInput().click();
                    expect(testEntityUpdatePage.getShowIconInput().isSelected()).toBeFalsy();
                } else {
                    testEntityUpdatePage.getShowIconInput().click();
                    expect(testEntityUpdatePage.getShowIconInput().isSelected()).toBeTruthy();
                }
            });
        testEntityUpdatePage.setIconInput('icon');
        expect(testEntityUpdatePage.getIconInput()).toMatch('icon');
        testEntityUpdatePage
            .getDividerInput()
            .isSelected()
            .then(selected => {
                if (selected) {
                    testEntityUpdatePage.getDividerInput().click();
                    expect(testEntityUpdatePage.getDividerInput().isSelected()).toBeFalsy();
                } else {
                    testEntityUpdatePage.getDividerInput().click();
                    expect(testEntityUpdatePage.getDividerInput().isSelected()).toBeTruthy();
                }
            });
        testEntityUpdatePage.setSortOrderInput('5');
        expect(testEntityUpdatePage.getSortOrderInput()).toMatch('5');
        testEntityUpdatePage.setTypeInput('type');
        expect(testEntityUpdatePage.getTypeInput()).toMatch('type');
        testEntityUpdatePage.setProductIdInput('5');
        expect(testEntityUpdatePage.getProductIdInput()).toMatch('5');
        testEntityUpdatePage.setUserIdInput('5');
        expect(testEntityUpdatePage.getUserIdInput()).toMatch('5');
        testEntityUpdatePage.save();
        expect(testEntityUpdatePage.getSaveButton().isPresent()).toBeFalsy();
    });

    afterAll(() => {
        navBarPage.autoSignOut();
    });
});
