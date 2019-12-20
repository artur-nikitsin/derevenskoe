import React, {Component} from 'react';
import {connect} from 'react-redux'
import {currentPageAction} from '../actions/currentPageAction'
import {Container} from '@material-ui/core';
import Grid from '@material-ui/core/Grid';

import Header from "./header/Header";
import MainCarousel from "./carousel/mainCarousel";
import Catalog from "./catalog/Catalog";
import Delivery from "./delivery/Delivery";
import Contacts from "./contacts/Contacts";
import Bucket from "./bucket/Busket"
import Footer from "./footer/Footer";
import CategoriesMenu from "./header/CategoriesMenu";
import {
    BrowserRouter,
    Route,
    Link, Switch
} from "react-router-dom";
import {createBrowserHistory} from "history";


const history = createBrowserHistory();


class MainPage extends Component {

    constructor(props) {
        super(props);
        this.state = {};
    }


    render() {

        return (
            <BrowserRouter history={history}>

                <Grid
                    container
                    direction="column"
                    justify="space-between"
                    alignItems="space-around">

                    <Header/>
                    <div className={"mainPage"}>
                        <Route exact path='/' component={MainCarousel}/>
                        <Route path='/catalog' component={Catalog}/>
                        <Route path='/delivery' component={Delivery}/>
                        <Route path='/contacts' component={Contacts}/>
                        <Route path='/search' component={Delivery}/>
                        <Route path='/basket' component={Bucket}/>
                    </div>
                    <Footer/>

                </Grid>

            </BrowserRouter>
        )
    }
}

function mapStateToProps(state) {
    console.log(state);
    return {
        currentPage: state.currentPageReducer
    }
}

export default connect(mapStateToProps, null)(MainPage);