package com.datastructure.leetcode;

//https://leetcode.com/problems/defanging-an-ip-address/
public class LeetCode_1108_DefangingAnIPAddress {

    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}
