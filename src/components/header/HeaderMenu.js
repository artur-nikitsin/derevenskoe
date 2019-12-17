import React, {Component} from 'react';
import {connect} from 'react-redux'
import {currentPageAction} from '../../actions/currentPageAction'
import {Container} from '@material-ui/core';
import "./styles/header.scss"
import {Link, NavLink} from "react-router-dom";


class HeaderMenu extends Component {

    constructor(props) {
        super(props);
    }

    changePage = (val, e) => {
        e.preventDefault();
        this.props.dispatch(currentPageAction(val))
    };


    render() {
        const currentPage = this.props.currentPage;

        return (
            <div className={"HeaderMenu"}>
                <Container className={"container"}>
                    <ul>

                        {/*  react router*/}
                        <li><NavLink to="/"  exact activeClassName={'active'}> TestMainCarousel </NavLink></li>
                        <li><NavLink to="catalog"  activeClassName="active"> Catalog </NavLink></li>
                        <li><NavLink to="delivery" activeClassName='active'> Delivery </NavLink></li>
                        <li><NavLink to="contacts"> Contacts </NavLink></li>
                        <li><NavLink to="search"> Search </NavLink></li>
                        <li><NavLink to="basket"> Basket </NavLink></li>
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