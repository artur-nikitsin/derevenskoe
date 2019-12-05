import React, {Component} from 'react';
import { Container } from '@material-ui/core';
import "./styles/Header.scss"

class HeaderMenu extends Component {
    render() {
        return (
            <div className={"HeaderMenu"}>
                <Container className={"container"}>
               <ul>
                   <li><a href="">ГЛАВНАЯ</a></li>
                   <li><a href="">КАТАЛОГ</a></li>
                   <li><a href="">ДОСТАВКА И ОПЛАТА</a></li>
                   <li><a href="">СОТРУДНИЧЕСТВО</a></li>
                   <li><a href="">КОНТАКТЫ</a></li>
                   <li><a href="">Search</a></li>
                   <li><a href="">КОРЗИНА</a></li>
               </ul>
                </Container>
            </div>
        );
    }
}

export default HeaderMenu;