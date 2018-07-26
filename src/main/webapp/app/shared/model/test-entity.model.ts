export interface ITestEntity {
    id?: number;
    recordId?: number;
    lable?: string;
    title?: string;
    url?: string;
    showIcon?: boolean;
    icon?: string;
    divider?: boolean;
    sortOrder?: number;
    type?: string;
    productId?: number;
    userId?: number;
}

export class TestEntity implements ITestEntity {
    constructor(
        public id?: number,
        public recordId?: number,
        public lable?: string,
        public title?: string,
        public url?: string,
        public showIcon?: boolean,
        public icon?: string,
        public divider?: boolean,
        public sortOrder?: number,
        public type?: string,
        public productId?: number,
        public userId?: number
    ) {
        this.showIcon = false;
        this.divider = false;
    }
}
