import React, {Component} from 'react';
import {Container} from '@material-ui/core';
import "./styles/header.scss"

class CategoriesMenu extends Component {
    render() {
        return (
            <div className={"CategoriesMenu"}>
                <Container className={"container"}>
                    <ul>
                        <li><a href="">Овощи</a></li>
                        <li><a href="">Закатки</a></li>
                        <li><a href="">Варенье</a></li>
                        <li><a href="">Пельмени и вареники</a></li>
                        <li><a href="">Молочные продукты</a></li>
                        <li><a href="">Хлеб</a></li>

                        <li><a href="">Мясо</a></li>
                        <li><a href="">Яйца и мед</a></li>
                        <li><a href="">Растительные масла и урбеч</a></li>
                        <li><a href="">Травяной чай</a></li>
                        <li><a href="">Разное</a></li>
                    </ul>


                </Container>
            </div>
        );
    }
}

export default CategoriesMenu;