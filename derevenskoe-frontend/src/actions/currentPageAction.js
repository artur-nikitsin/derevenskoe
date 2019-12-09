import {CURRENT_PAGE} from '../constants'

export   let  currentPageAction = (currentPage) => {
    return {
        type: CURRENT_PAGE,
        payload: {currentPage}
    }
};