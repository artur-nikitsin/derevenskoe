import React, {Component} from 'react';
import {Container} from '@material-ui/core';
import Header from "../header/Header";
import MainCarousel from "../carousel/mainCarousel";
import CategoriesMenu from "../header/CategoriesMenu";

class MainPage extends Component {
    render() {
        return (
            <div>
                <Header/>
                <MainCarousel/>
            </div>
        )
    }
}

export default MainPage;