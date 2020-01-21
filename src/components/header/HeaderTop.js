import React, {Component} from 'react';
import {Container} from '@material-ui/core';
import HeadsetMicIcon from '@material-ui/icons/HeadsetMic';
import MailOutlineIcon from '@material-ui/icons/MailOutline';
import Grid from '@material-ui/core/Grid';
import "./styles/headerTop.scss"


class HeaderTop extends Component {
    constructor(props) {
        super(props);
    }

    render() {

        return (
            <div className={this.props.scrolled ? "headerTopOff" : "headerTop"}>
                <Container className={"container"}>
                    <ul>
                        <Grid container
                              direction="row"
                              justify="space-between"
                              alignItems="center">
                            <li><img src={process.env.PUBLIC_URL + "/assets/images/logo.png"} alt="derevenskoe-minsk.by"
                                     width="280" height="54"/></li>
                            <li><HeadsetMicIcon/> +375(29)167-84-33</li>
                            <li><MailOutlineIcon/> zakaz@derevenskoe-minsk.by</li>
                            <li>Доставка осуществляется с понедельника по пятницу</li>
                        </Grid>
                    </ul>
                </Container>

            </div>
        )
    }
}

export default HeaderTop