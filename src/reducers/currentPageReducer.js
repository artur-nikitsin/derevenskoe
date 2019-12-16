import {CURRENT_PAGE} from '../constants'

let initialState = 'main';

let currentPageReducer = (state = initialState, action) => {

    switch (action.type) {
        case CURRENT_PAGE: {
            if (action.payload.currentPage) {
                state = action.payload.currentPage;

                return state;
            } else {

            }
        }
        default:
            return state;
    }
};
export default currentPageReducer;