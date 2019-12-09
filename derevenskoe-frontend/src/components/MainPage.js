import React, {Component} from 'react';
import {connect} from 'react-redux'
import {currentPageAction} from '../actions/currentPageAction'
import {Container} from '@material-ui/core';
import Header from "./header/Header";
import MainCarousel from "./carousel/mainCarousel";
import CategoriesMenu from "./header/CategoriesMenu";

class MainPage extends Component {

    constructor(props) {
        super(props);
        this.state = {}
    }

    render() {


        return (
            <div>
                <Header/>
                <MainCarousel/>
            </div>
        )
    }
}


function mapStateToProps(state) {
    return {
        currentPage: state.currentPageReducer
    }
}

export default connect(mapStateToProps, null)(MainPage);