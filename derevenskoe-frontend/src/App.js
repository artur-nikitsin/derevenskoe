import React, {Component} from 'react';
import {connect} from 'react-redux'
import Header from './components/header/Header'
import MainPage from "./components/MainPage";

class App extends Component {

    constructor(props) {
        super(props);
    }
    render() {
        return (
            <MainPage/>
        );
    }

}

function mapStateToProps(state) {
    return {
        currentPage: state.currentPageReducer
    }
}

export default connect(mapStateToProps, null)(App);