import React, {Component} from 'react';
import {connect} from 'react-redux'
import {currentPageAction} from '../../actions/currentPageAction'
import {Container} from '@material-ui/core';
import "./styles/Header.scss"

class HeaderMenu extends Component {

    constructor(props) {
        super(props);
    }

    changePage = (val) => this.props.dispatch(currentPageAction(val));

    render() {
        return (
            <div className={"HeaderMenu"}>
                <Container className={"container"}>
                    <ul>
                        <li onClick={() => this.changePage('main')}><a href="">ГЛАВНАЯ</a></li>
                        <li onClick={() => this.changePage('catalog')}><a href="">КАТАЛОГ</a></li>
                        <li onClick={() => this.changePage('delivery')}><a href="">ДОСТАВКА И ОПЛАТА</a></li>
                        <li onClick={() => this.changePage('cooperation')}><a href="">СОТРУДНИЧЕСТВО</a></li>
                        <li onClick={() => this.changePage('contacts')}><a href="">КОНТАКТЫ</a></li>
                        <li onClick={() => this.changePage('search')}><a href="">Search</a></li>
                        <li onClick={() => this.changePage('basket')}><a href="">КОРЗИНА</a></li>
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