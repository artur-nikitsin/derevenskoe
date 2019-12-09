import {CURRENT_PAGE} from '../constants'

let initialState = {currentPage: 'main'};

let currentPageReducer = (state = initialState, action) => {

    switch (action.type) {
        case CURRENT_PAGE: {
            if (action.payload.currentPage) {
                state.currentPage = action.payload.currentPage;
                console.log(state);
                return state;
            } else {
                console.log(state)
            }
        }
        default:
            return state;
    }
};
export default currentPageReducer;