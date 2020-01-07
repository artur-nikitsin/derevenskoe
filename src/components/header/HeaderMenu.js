import React, {Component} from 'react';
import {connect} from 'react-redux'
import {currentPageAction} from '../../actions/currentPageAction'
import {Container} from '@material-ui/core';
import SearchIcon from '@material-ui/icons/Search';
import ShoppingCartIcon from '@material-ui/icons/ShoppingCart';
import "./styles/header.scss"
import {Link, NavLink} from "react-router-dom";


class HeaderMenu extends Component {

    constructor(props) {
        super(props);
    }

    /* changePage = (val, e) => {
         e.preventDefault();
         this.props.dispatch(currentPageAction(val))
     };*/


    render() {
        const currentPage = this.props.currentPage;

        return (
            <div className={"HeaderMenu"}>
                <Container className={"container"}>

                    <nav className="navbar navbar-expand-lg navbar-light bg-light">

                        <button className="navbar-toggler" type="button" data-toggle="collapse"
                                data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent"
                                aria-expanded="false" aria-label="Toggle navigation">
                            <span className="navbar-toggler-icon"></span>

                        </button>


                        <div className="collapse navbar-collapse" id="navbarSupportedContent">

                            <ul className="navbar-nav mr-auto">

                                <li className="nav-item active">
                                    <NavLink to="/" exact activeClassName='active'> ГЛАВНАЯ </NavLink>
                                </li>

                                <li className="nav-item dropdown">
                                    <a className="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                                       data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                        КАТАЛОГ
                                    </a>
                                    <div className="dropdown-menu" aria-labelledby="navbarDropdown">
                                        <a className="dropdown-item" href="#">Action</a>
                                        <a className="dropdown-item" href="#">Another action</a>
                                        <div className="dropdown-divider"></div>
                                        <a className="dropdown-item" href="#">Something else here</a>
                                    </div>
                                </li>

                                <li className="nav-item">
                                    <NavLink to="/delivery" exact activeClassName='active'> ДОСТАВКА </NavLink>
                                </li>

                                <li className="nav-item">
                                    <NavLink to="/contacts" exact activeClassName='active'> КОНТАКТЫ </NavLink>
                                </li>

                                <li className="nav-item">
                                    <ShoppingCartIcon/> <NavLink to="/basket" exact
                                                                 activeClassName='active'> КОРЗИНА </NavLink>
                                </li>

                            </ul>


                            <form className="form-inline my-2 my-lg-0">
                                <input className="form-control mr-sm-2" type="search" placeholder="Search"
                                       aria-label="Search"/>
                                <button className="btn btn-outline-success my-2 my-sm-0" type="submit">Search
                                </button>
                            </form>
                        </div>
                    </nav>


                    <ul>

                        {/*  react router*/}
                        {/*   <li><NavLink to="/" exact activeClassName='active'> ГЛАВНАЯ </NavLink></li>
                        <li><NavLink to="/catalog" activeClassName='active'> КАТАЛОГ </NavLink></li>
                        <li><NavLink to="/delivery" exact activeClassName='active'> ДОСТАВКА </NavLink></li>
                        <li><NavLink to="/contacts" exact activeClassName='active'> КОНТАКТЫ </NavLink></li>
                        <li><SearchIcon/> <NavLink to="/search" exact activeClassName='active'> ПОИСК </NavLink></li>
                        <li><ShoppingCartIcon/> <NavLink to="/basket" exact activeClassName='active'> КОРЗИНА </NavLink>
                        </li>*/}
                        {/*  react router*/}

                        {/*
                        <li className={currentPage === 'main' ? 'active' : ''}>
                            <a href="" onClick={(e) =>
                                this.changePage('main', e)}>ГЛАВНАЯ</a>
                        </li>

                        <li className={currentPage === 'catalog' ? 'active' : ''}>
                            <a href="" onClick={(e) =>
                                this.changePage('catalog', e)}>КАТАЛОГ</a>
                        </li>

                        <li className={currentPage === 'delivery' ? 'active' : ''}>
                            <a href="" onClick={(e) =>
                                this.changePage('delivery', e)}>ДОСТАВКА И ОПЛАТА</a>
                        </li>

                        <li className={currentPage === 'cooperation' ? 'active' : ''}>
                            <a href="" onClick={(e) =>
                                this.changePage('cooperation', e)}>СОТРУДНИЧЕСТВО</a>
                        </li>

                        <li className={currentPage === 'contacts' ? 'active' : ''}>
                            <a href="" onClick={(e) =>
                                this.changePage('contacts', e)}>КОНТАКТЫ</a>
                        </li>

                        <li className={currentPage === 'search' ? 'active' : ''}>
                            <a href="" onClick={(e) =>
                                this.changePage('search', e)}>Search</a>
                        </li>

                        <li className={currentPage === 'basket' ? 'active' : ''}>
                            <a href="" onClick={(e) =>
                                this.changePage('basket', e)}>КОРЗИНА</a>
                        </li>*/}
                    </ul>
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