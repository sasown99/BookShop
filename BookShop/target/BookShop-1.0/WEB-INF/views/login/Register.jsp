<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<title>Đăng ký</title>

<!-- breadcrumbs-area-start -->
<div class="breadcrumbs-area mb-70">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="breadcrumbs-menu">
                    <ul>
                        <li><a href="#">Home</a></li>
                        <li><a href="#" class="active">register</a></li>
                    </ul>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- breadcrumbs-area-end -->
<!-- user-login-area-start -->
<div class="user-login-area mb-70">
    <div class="container">
        <div class="row">
            <div class="col-lg-12">
                <div class="login-title text-center mb-30">
                    <h2>Sign Up</h2>
                    <p>doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo<br>inventore veritatis et quasi architecto beat</p>
                </div>
            </div>
            <div class="col-lg-offset-2 col-lg-8 col-md-offset-2 col-md-8 col-sm-12 col-xs-12">
                <div class="billing-fields">
                    <div class="row">
                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                            <div class="single-register">
                                <form action="#">
                                    <label>First Name<span>*</span></label>
                                    <input type="text" />
                                </form>
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                            <div class="single-register">
                                <form action="#">
                                    <label>Last Name<span>*</span></label>
                                    <input type="text" />
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="single-register">
                        <form action="#">
                            <label>Company Name</label>
                            <input type="text" />
                        </form>
                    </div>
                    <div class="row">
                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                            <div class="single-register">
                                <form action="#">
                                    <label>Email Address<span>*</span></label>
                                    <input type="text" />
                                </form>
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                            <div class="single-register">
                                <form action="#">
                                    <label>Phone<span>*</span></label>
                                    <input type="text" />
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="single-register">
                        <label>Country<span>*</span></label>
                        <select class="chosen-select" tabindex="1" style="width:100%;" data-placeholder="Default Sorting">
                            <option value="country">Select a country</option>
                            <option value="Islands">Aland Islands</option>
                            <option value="Afghanistan">Afghanistan</option>
                            <option value="Albania">Albania</option>
                            <option value="Samoa">American Samoa</option>
                        </select>
                    </div>
                    <div class="single-register">
                        <form action="#">
                            <label>Address<span>*</span></label>
                            <input type="text" placeholder="Street address" />
                            <input type="text" id="billing_address_2" placeholder="Apartment, suite, unit etc. (optional" />
                        </form>
                    </div>
                    <div class="single-register">
                        <form action="#">
                            <label>Town/City<span>*</span></label>
                            <input type="text" />
                        </form>
                    </div>
                    <div class="row">
                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                            <div class="single-register">
                                <label>State<span>*</span></label>
                                <select class="chosen-select" tabindex="1" style="width:100%;" data-placeholder="Default Sorting">
                                    <option value="Select">Select a State</option>
                                    <option value="Andhra">Andhra Pradesh</option>
                                    <option value="Pradesh">Arunachal Pradesh</option>
                                    <option value="Delhi">Delhi</option>
                                    <option value="Lakshadeep">Lakshadeep</option>
                                </select>
                            </div>
                        </div>
                        <div class="col-lg-6 col-md-6 col-sm-6 col-xs-12">
                            <div class="single-register">
                                <form action="#">
                                    <label>Postcode/zip<span>*</span></label>
                                    <input type="text" placeholder="Postcode/zip" />
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="single-register">
                        <form action="#">
                            <label>Account password<span>*</span></label>
                            <input type="text" placeholder="Password" />
                        </form>
                    </div>
                    <div class="single-register">
                        <form action="#">
                            <label>Confirm password<span>*</span></label>
                            <input type="text" placeholder="Password" />
                        </form>
                    </div>
                    <div class="single-register single-register-3">
                        <input id="rememberme" type="checkbox" name="rememberme" value="forever">
                        <label class="inline">I agree <a href="#">Terms & Condition</a></label>
                    </div>
                    <div class="single-register">
                        <a href="#">Register</a>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- user-login-area-end -->