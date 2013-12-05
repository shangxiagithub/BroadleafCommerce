/*
 * #%L
 * BroadleafCommerce Common Libraries
 * %%
 * Copyright (C) 2009 - 2013 Broadleaf Commerce
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *       http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

package org.broadleafcommerce.common.payment.service;

import org.broadleafcommerce.common.payment.dto.PaymentResponseDTO;

/**
 * @author Elbert Bautista (elbertbautista)
 *
 * This API allows each module to provide its own implementation for rollback.
 * Each module needs to implement this if for some reason the checkout workflow fails
 * after payments have been finalized and the submitted transaction needs to rollback.
 *
 */
public interface PaymentGatewayRollbackService {

    public PaymentResponseDTO rollbackAuthorize(PaymentResponseDTO originalResponse);

    public PaymentResponseDTO rollbackCapture(PaymentResponseDTO originalResponse);

    public PaymentResponseDTO rollbackAuthorizeAndCapture(PaymentResponseDTO originalResponse);

    public PaymentResponseDTO rollbackRefund(PaymentResponseDTO originalResponse);

}
