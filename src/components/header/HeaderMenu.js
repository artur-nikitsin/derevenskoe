import React, {useState} from 'react';
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

import {
    Collapse,
    Navbar,
    NavbarToggler,
    NavbarBrand,
    Nav,
    NavItem,
    UncontrolledDropdown,
    DropdownToggle,
    DropdownMenu,
    DropdownItem,
    NavbarText
} from 'reactstrap';

const HeaderMenu = (props) => {
    const [isOpen, setIsOpen] = useState(false);

    const toggle = () => {
        if (props.mobileWidth) {
            setIsOpen(!isOpen)
        }
    };

    return (
        <div className={"HeaderMenu"}>
            <Container className={"container"}>

                <Navbar color="light" light expand="md">
                    <NavbarBrand href="/">Деревенские продукты</NavbarBrand>
                    <NavbarToggler onClick={toggle}/>


                    <Collapse isOpen={isOpen} navbar>
                        <Container>
                            <Nav className="mr-auto" navbar>


                                <NavItem>
                                    <NavLink to="/" exact activeClassName='active'
                                             onClick={toggle}> ГЛАВНАЯ </NavLink>
                                </NavItem>

                                <UncontrolledDropdown nav inNavbar className={"dropdownCategoriesMenu"}>
                                    <DropdownToggle nav caret>
                                        <NavLink to="/catalog" activeClassName='active' onClick={toggle}>
                                            КАТАЛОГ </NavLink>
                                    </DropdownToggle>
                                    <DropdownMenu right>
                                        <DropdownItem>
                                            <NavLink to="/catalog/vegetables" className="dropdown-item"
                                                     onClick={toggle}>
                                                Овощи</NavLink>
                                        </DropdownItem>
                                        <DropdownItem divider/>
                                        <DropdownItem>
                                            <NavLink to="/catalog/zakatki" className="dropdown-item"
                                                     activeClassName='active' onClick={toggle}>Закатки</NavLink>
                                        </DropdownItem>
                                        <DropdownItem divider/>
                                        <DropdownItem>
                                            <NavLink to="/catalog/jam" className="dropdown-item"
                                                     activeClassName='active' onClick={toggle}>Варенье</NavLink>
                                        </DropdownItem>
                                        <DropdownItem divider/>
                                        <DropdownItem>
                                            <NavLink to="/catalog/dumplings" className="dropdown-item"
                                                     activeClassName='active' onClick={toggle}>Пельмени и
                                                вареники</NavLink>
                                        </DropdownItem>
                                        <DropdownItem divider/>

                                        <DropdownItem>
                                            <NavLink to="/catalog/milk_products" className="dropdown-item"
                                                     activeClassName='active' onClick={toggle}>Молочные
                                                продукты</NavLink>
                                        </DropdownItem>
                                        <DropdownItem divider/>


                                        <DropdownItem>
                                            <NavLink to="/catalog/bread" className="dropdown-item"
                                                     activeClassName='active' onClick={toggle}>Хлеб</NavLink>
                                        </DropdownItem>
                                        <DropdownItem divider/>

                                        <DropdownItem>
                                            <NavLink to="/catalog/meat" className="dropdown-item"
                                                     activeClassName='active' onClick={toggle}>Мясо</NavLink>
                                        </DropdownItem>
                                        <DropdownItem divider/>

                                        <DropdownItem>
                                            <NavLink to="/catalog/eggs_honey" className="dropdown-item"
                                                     activeClassName='active' onClick={toggle}>Яйца и
                                                мед</NavLink>
                                        </DropdownItem>
                                        <DropdownItem divider/>
                                        <DropdownItem>
                                            <NavLink to="/catalog/oils" className="dropdown-item"
                                                     activeClassName='active' onClick={toggle}>
                                                Растительные
                                                масла и
                                                урбеч</NavLink>
                                        </DropdownItem>
                                        <DropdownItem divider/>
                                        <DropdownItem>
                                            <NavLink to="/catalog/tea" className="dropdown-item"
                                                     activeClassName='active' onClick={toggle}>
                                                Травяной
                                                чай</NavLink>
                                        </DropdownItem>
                                        <DropdownItem divider/>

                                        <DropdownItem>
                                            <NavLink to="/catalog/other" className="dropdown-item"
                                                     activeClassName='active' onClick={toggle}>Разное</NavLink>
                                        </DropdownItem>

                                    </DropdownMenu>
                                </UncontrolledDropdown>

                                <NavItem>
                                    <NavLink to="/delivery" exact activeClassName='active' onClick={toggle}>
                                        ДОСТАВКА </NavLink>
                                </NavItem>

                                <NavItem className="nav-item">
                                    <NavLink to="/basket" exact
                                             activeClassName='active' onClick={toggle}>
                                        КОРЗИНА </NavLink>
                                </NavItem>

                                <NavItem className="nav-item">
                                    <form className="form-inline my-2 my-lg-0">
                                        <input className="form-control mr-sm-2" type="search"
                                               placeholder="Найти товар..."
                                               aria-label="Search"/>
                                        <button className="btn btn-outline-success my-2 my-sm-0" type="submit">Поиск
                                        </button>
                                    </form>
                                </NavItem>

                            </Nav>
                        </Container>
                    </Collapse>

                </Navbar>

            </Container>

        </div>
    );
};

export default HeaderMenu;