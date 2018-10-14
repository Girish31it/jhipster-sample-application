import { Moment } from 'moment';

export interface IEmployee {
    id?: number;
    recordId?: number;
    fName?: string;
    lName?: string;
    gender?: boolean;
    dob?: Moment;
    dept?: string;
}

export class Employee implements IEmployee {
    constructor(
        public id?: number,
        public recordId?: number,
        public fName?: string,
        public lName?: string,
        public gender?: boolean,
        public dob?: Moment,
        public dept?: string
    ) {
        this.gender = this.gender || false;
    }
}
