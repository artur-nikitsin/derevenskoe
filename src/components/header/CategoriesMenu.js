import React, {Component} from 'react';
import {Container} from '@material-ui/core';
import "./styles/header.scss"
import {Link, NavLink} from "react-router-dom";

class CategoriesMenu extends Component {
    render() {
        return (
            <div className={"CategoriesMenu"}>
                <Container className={"container"}>
                    <ul>
                        <li><NavLink to="/catalog/vegetables" activeClassName='active'>Овощи</NavLink></li>
                        <li><NavLink to="/catalog/zakatki" activeClassName='active'>Закатки</NavLink></li>
                        <li><NavLink to="/catalog/jam" activeClassName='active'>Варенье</NavLink></li>
                        <li><NavLink to="/catalog/dumplings" activeClassName='active'>Пельмени и вареники</NavLink></li>
                        <li><NavLink to="/catalog/milk_products" activeClassName='active'>Молочные продукты</NavLink>
                        </li>
                        <li><NavLink to="/catalog/bread" activeClassName='active'>Хлеб</NavLink></li>
                        <li><NavLink to="/catalog/meat" activeClassName='active'>Мясо</NavLink></li>
                        <li><NavLink to="/catalog/eggs_honey" activeClassName='active'>Яйца и мед</NavLink></li>
                        <li><NavLink to="/catalog/oils" activeClassName='active'>Растительные масла и урбеч</NavLink>
                        </li>
                        <li><NavLink to="/catalog/tea" activeClassName='active'>Травяной чай</NavLink></li>
                        <li><NavLink to="/catalog/other" activeClassName='active'>Разное</NavLink></li>
                    </ul>


                </Container>
            </div>
        );
    }
}

export default CategoriesMenu;