/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.com.bottega.ecommerce.sales.domain.taxation;

import pl.com.bottega.ecommerce.sales.domain.invoicing.RequestItem;

/**
 *
 * @author karko
 */
public interface TaxPolicyInterface {

    public Tax calculateTax(RequestItem requestItem);
    
}
