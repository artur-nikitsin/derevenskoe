import React, {Component} from 'react';
import {connect} from 'react-redux'
import MainPage from "./components/MainPage";
import 'bootstrap';

import './styles/styles.scss'
import 'reset-css'
import 'normalize.css'
import 'bootstrap/dist/css/bootstrap.min.css';
import 'bootstrap/dist/js/bootstrap.min.js';

class App extends Component {

    constructor(props) {
        super(props);
    }


    render() {
        return (
            <MainPage className={"mainPage"}/>
        );
    }

}

function mapStateToProps(state) {
    return {
        currentPage: state.currentPageReducer
    }
}

export default connect(mapStateToProps, null)(App);