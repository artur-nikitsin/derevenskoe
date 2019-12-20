import React, {Component} from 'react';
import {connect} from 'react-redux'
import Header from './components/header/Header'
import MainPage from "./components/MainPage";
import './styles/styles.scss'
import 'reset-css'
import 'normalize.css'

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