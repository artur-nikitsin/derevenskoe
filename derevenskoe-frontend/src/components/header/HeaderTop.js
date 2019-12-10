import React, {Component} from 'react';
import {Container} from '@material-ui/core';
import HeadsetMicIcon from '@material-ui/icons/HeadsetMic';
import MailOutlineIcon from '@material-ui/icons/MailOutline';

class HeaderTop extends Component {
    render() {
        return (
            <div className={"HeaderTop"}>
                <Container className={"container"}>
                    <ul>
                        <li> <img src="img/logo.png" alt="derevenskoe-minsk.by" width="280" height="54"/></li>
                        <li><HeadsetMicIcon/> <a href="">+375(29)167-84-33</a></li>
                        <li><MailOutlineIcon/> <a href="">zakaz@derevenskoe-minsk.by</a></li>
                        <li><a href="">Доставка осуществляется с понедельника по пятницу</a></li>

                    </ul>
                </Container>

            </div>
        )
    }
}

export default HeaderTop