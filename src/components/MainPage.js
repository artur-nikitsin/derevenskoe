import React, {Component} from 'react';
import {connect} from 'react-redux'
import {currentPageAction} from '../actions/currentPageAction'
import {Container} from '@material-ui/core';
import Header from "./header/Header";
import MainCarousel from "./carousel/mainCarousel";
import Catalog from "./catalog/Catalog";
import Delivery from "./delivery/Delivery";
import CategoriesMenu from "./header/CategoriesMenu";
import {
    BrowserRouter,
    Route,
    Link
} from "react-router-dom";


class MainPage extends Component {

    constructor(props) {
        super(props);
        this.state = {};
    }


    render() {

        /*  const currentPage = this.props.currentPage;

          function CurrentPage() {
              if (currentPage === 'main') {
                  return <MainCarousel/>
              }
              if (currentPage === 'catalog') {
                  return <Catalog/>
              }
              if (currentPage === 'delivery') {
                  return <Delivery/>
              }
              if (currentPage === 'cooperation') {
                  return <p>Cooperation</p>
              }
              if (currentPage === 'contacts') {
                  return <p>Contacts</p>
              }
              if (currentPage === 'search') {
                  return <p>search</p>
              }
              if (currentPage === 'basket') {
                  return <p>basket</p>
              }
          }
  */

        return (
            <BrowserRouter>
                <div>
                    <Header/>
                    {/*  <CurrentPage/>*/}
                    <Route exact path='/' component={MainCarousel}/>
                    <Route exact path='/catalog' component={Catalog}/>
                    <Route exact path='/delivery' component={Delivery}/>
                    <Route exact path='/contacts' component={Delivery}/>
                    <Route exact path='/search' component={Delivery}/>
                    <Route exact path='/catalog' component={Catalog}/>

                </div>
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