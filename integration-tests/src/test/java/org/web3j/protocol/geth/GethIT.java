package org.web3j.protocol.geth;

import org.junit.Before;
import org.junit.Test;
import org.web3j.protocol.admin.methods.response.PersonalListAccounts;
import org.web3j.protocol.http.HttpService;

import static org.junit.Assert.*;

/**
 * JSON-RPC 2.0 Integration Tests.
 */
public class GethIT {

    private Geth geth;

    @Before
    public void setUp() {
        this.geth = Geth.build(new HttpService());
    }

    @Test
    public void testPersonalListAccounts() throws Exception {
        PersonalListAccounts personalListAccounts = geth.personalListAccounts().send();
        assertNotNull(personalListAccounts.getAccountIds());
    }
}
