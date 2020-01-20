import React, {Component} from 'react';
import Slider from "react-slick";
import {Container} from '@material-ui/core';
import ArrowBackIosIcon from '@material-ui/icons/ArrowBackIos';
import ArrowForwardIosIcon from '@material-ui/icons/ArrowForwardIos';
import Grid from '@material-ui/core/Grid';
import "./styles/carousel.scss"

class MainCarousel extends Component {

    render() {


        function NextArrow(props) {
            const {className, onClick} = props;

            return (
                <ArrowForwardIosIcon
                    className={className}
                    onClick={onClick}
                    style={{fontSize: 50}}/>
            );
        }

        function PrevArrow(props) {
            const {className, onClick} = props;
            return (
                <ArrowBackIosIcon
                    className={className}
                    onClick={onClick}
                    style={{fontSize: 50}}/>

            );
        }


        const settings = {
            dots: true,
            infinite: true,
            speed: 500,
            arrows: true,
            responsive: [
                {
                    breakpoint: 1920,
                    settings: {
                        slidesToShow: 2,
                        slidesToScroll: 2,
                        adaptiveHeight: true,
                        infinite: true,
                        dots: true
                    }
                },
                {
                    breakpoint: 600,
                    settings: {
                        slidesToShow: 1,
                        slidesToScroll: 1,
                        initialSlide: 1,
                        adaptiveHeight: true,
                    }
                },
                {
                    breakpoint: 480,
                    settings: {
                        slidesToShow: 1,
                        slidesToScroll: 1,
                        adaptiveHeight: true,
                    }
                }
            ],

            nextArrow: <NextArrow/>,
            prevArrow: <PrevArrow/>

        };

        /*TODO:    realize images requiring from components folders  */


        return (
            <Container>
                <Slider className={"slider1"} {...settings}>
                    <div>
                        <img src="assets/caroucel/10022a-960x400.webp" alt=""/>
                    </div>
                    <div>
                        <img src="assets/caroucel/bbab61-960x400.webp" alt=""/>
                    </div>
                    <div>
                        <img src="assets/caroucel/bbab61-960x400.webp" alt=""/>
                    </div>
                    <div>
                        <img src="assets/caroucel/bbab61-960x400.webp" alt=""/>
                    </div>

                </Slider>
            </Container>
        );
    }
}


export default MainCarousel;

