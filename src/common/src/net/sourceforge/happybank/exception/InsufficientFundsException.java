/*
 * Copyright 2005-2008 Kevin A. Lee
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package net.sourceforge.happybank.exception;

/**
 * This exception is thrown when an attempt is made to perform a transaction on
 * a banking account without the proper funds available.
 *
 * @author Kevin A. Lee
 * @email kevin.lee@buildmeister.com
 */
public class InsufficientFundsException extends BankException {

    /**
     * Generated serialization identifier.
     */
    private static final long serialVersionUID = 1L;

    /**
     * Default constructor.
     *
     * @param s
     *            title of the exception
     */
    public InsufficientFundsException(final String s) {
        super(s);
    } // InsufficientFundsException

    /**
     * Return the key of the exception.
     *
     * @return string containing the exception key
     */
    public final String getMessageKey() {
        return "error.insufficientFundsException";
    } // getMessageKey

} // InsufficientFundsException
