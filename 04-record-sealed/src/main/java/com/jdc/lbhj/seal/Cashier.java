package com.jdc.lbhj.seal;

//can't use from different pkg A class
public sealed interface Cashier permits Staff, Employee {}
