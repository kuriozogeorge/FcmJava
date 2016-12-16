// Copyright (c) Philipp Wagner. All rights reserved.
// Licensed under the MIT license. See LICENSE file in the project root for full license information.

package de.bytefish.fcmjava.client.http;

public interface IHttpClient {

    <TRequestMessage> void post(TRequestMessage requestMessage);

    <TRequestMessage, TResponseMessage> TResponseMessage post(TRequestMessage requestMessage, Class<TResponseMessage> responseType);

}
