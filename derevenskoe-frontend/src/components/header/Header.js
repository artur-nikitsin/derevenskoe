import React, {Component} from 'react';
import HeaderTop from "./HeaderTop";
import HeaderMenu from "./HeaderMenu";
import CategoriesMenu from "./CategoriesMenu";

import "./styles/Header.scss"

class Header extends Component {
    render() {
        return (
            <div className={"Header"}>
                <HeaderTop/>
                <HeaderMenu/>
                <CategoriesMenu/>
            </div>
        );
    }
}

export default Header;