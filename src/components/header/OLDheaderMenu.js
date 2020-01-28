/*
import React, {Component} from 'react';
import {connect} from 'react-redux'
import {currentPageAction} from '../../actions/currentPageAction'
import {Container} from '@material-ui/core';
import SearchIcon from '@material-ui/icons/Search';
import ShoppingCartIcon from '@material-ui/icons/ShoppingCart';
import LocalShippingIcon from '@material-ui/icons/LocalShipping';
import ListIcon from '@material-ui/icons/List';
import ContactPhoneIcon from '@material-ui/icons/ContactPhone';
import PermPhoneMsgIcon from '@material-ui/icons/PermPhoneMsg';

import Grid from '@material-ui/core/Grid';
import "./styles/headerMenu.scss"
import {Link, NavLink} from "react-router-dom";


class HeaderMenu extends Component {

    constructor(props) {
        super(props);
    }

    /!* changePage = (val, e) => {
         e.preventDefault();
         this.props.dispatch(currentPageAction(val))
     };*!/


    render() {
        const currentPage = this.props.currentPage;

        return (

            <div className={"HeaderMenu"}>
                <Container className={"container"}>

                    <nav className="navbar navbar-expand-lg navbar-light bg-light">
                        <a className="navbar-brand" href="#">Деревенские продукты</a>
                        <button className="navbar-toggler" type="button" data-toggle="collapse"
                                data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                                aria-expanded="false" aria-label="Toggle navigation">
                            <span className="navbar-toggler-icon"></span>
                        </button>


                        <div className="collapse navbar-collapse" id="navbarSupportedContent">

                            <ul className="navbar-nav mr-auto">

                                {/!* <Grid container
                                      direction="row"
                                      justify="space-between"
                                      alignItems="flex-start">*!/}

                                <li className="nav-item">
                                    <NavLink to="/" exact activeClassName='active'> ГЛАВНАЯ </NavLink>
                                </li>

                                <li className="nav-item dropdown">

                                    <NavLink to="/catalog" activeClassName='active' className=" dropdown-toggle"
                                             id="navbarDropdown" role="button"
                                             data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        КАТАЛОГ <ListIcon/>
                                    </NavLink>


                                    <div className="dropdown-menu" aria-labelledby="navbarDropdown">
                                        <NavLink to="/catalog/vegetables" className="dropdown-item">
                                            Овощи</NavLink>

                                        <div className="dropdown-divider"></div>

                                        <NavLink to="/catalog/zakatki" className="dropdown-item"
                                                 activeClassName='active'>Закатки</NavLink>
                                        <div className="dropdown-divider"></div>

                                        <NavLink to="/catalog/jam" className="dropdown-item"
                                                 activeClassName='active'>Варенье</NavLink>
                                        <div className="dropdown-divider"></div>

                                        <NavLink to="/catalog/dumplings" className="dropdown-item"
                                                 activeClassName='active'>Пельмени и
                                            вареники</NavLink>

                                        <div className="dropdown-divider"></div>

                                        <NavLink to="/catalog/milk_products" className="dropdown-item"
                                                 activeClassName='active'>Молочные
                                            продукты</NavLink>

                                        <div className="dropdown-divider"></div>

                                        <NavLink to="/catalog/bread" className="dropdown-item"
                                                 activeClassName='active'>Хлеб</NavLink>
                                        <div className="dropdown-divider"></div>

                                        <NavLink to="/catalog/meat" className="dropdown-item"
                                                 activeClassName='active'>Мясо</NavLink>
                                        <div className="dropdown-divider"></div>

                                        <NavLink to="/catalog/eggs_honey" className="dropdown-item"
                                                 activeClassName='active'>Яйца и
                                            мед</NavLink>
                                        <div className="dropdown-divider"></div>

                                        <NavLink to="/catalog/oils" className="dropdown-item"
                                                 activeClassName='active'>
                                            Растительные
                                            масла и
                                            урбеч</NavLink>
                                        <div className="dropdown-divider"></div>

                                        <NavLink to="/catalog/tea" className="dropdown-item"
                                                 activeClassName='active'>
                                            Травяной
                                            чай</NavLink>

                                        <div className="dropdown-divider"></div>

                                        <NavLink to="/catalog/other" className="dropdown-item"
                                                 activeClassName='active'>Разное</NavLink>


                                    </div>

                                </li>

                                <li className="nav-item">
                                    <NavLink to="/delivery" exact activeClassName='active'>
                                        ДОСТАВКА <LocalShippingIcon/></NavLink>
                                </li>

                                <li className="nav-item">
                                    <NavLink to="/contacts" exact activeClassName='active'> КОНТАКТЫ <PermPhoneMsgIcon/>
                                    </NavLink>
                                </li>

                                <li className="nav-item">
                                    <NavLink to="/basket" exact
                                             activeClassName='active'>
                                        КОРЗИНА <ShoppingCartIcon/> </NavLink>
                                </li>
                                {/!*</Grid>*!/}
                            </ul>


                            <form className="form-inline my-2 my-lg-0">
                                <input className="form-control mr-sm-2" type="search" placeholder="Найти товар..."
                                       aria-label="Search"/>
                                <button className="btn btn-outline-success my-2 my-sm-0" type="submit">Поиск
                                </button>
                            </form>
                        </div>

                    </nav>

                </Container>

            </div>
        );
    }
}

function mapStateToProps(state) {
    return {
        currentPage: state.currentPageReducer
    }
}

export default connect(mapStateToProps, null)(HeaderMenu);


*/