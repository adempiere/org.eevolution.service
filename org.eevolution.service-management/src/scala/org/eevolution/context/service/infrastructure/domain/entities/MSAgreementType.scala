/** Copyright (C) 2023, e-Evolution , http://e-evolution.com This program is free software: you can redistribute it and/or modify it under the terms of the GNU General Public License as published by
  * the Free Software Foundation, either version 3 of the License, or (at your option) any later version. This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
  * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License for more details. You should have received a copy of the GNU General
  * Public License along with this program. If not, see <http://www.gnu.org/licenses/>. Email: victor.perez@e-evolution.com , http://www.e-evolution.com , http://github.com/e-Evolution Created by
  * victor.perez@e-evolution.com , www.e-evolution.com
  */

package org
package eevolution
package context
package service
package infrastructure
package domain
package entities

import org.adempiere.core.domains.models.X_S_AgreementType

import java.sql.ResultSet
import java.util.{Comparator, Properties}

class MSAgreementType(
  ctx:     Properties,
  id:      Int,
  rs:      ResultSet,
  trxName: String)
    extends X_S_AgreementType(ctx: Properties, id: Int, trxName: String) {

  def this(
    ctx:     Properties,
    id:      Int,
    trxName: String
  ) = {
    this(ctx, id, null, trxName)
    load(id, trxName)
  }

  def this(
    ctx:     Properties,
    rs:      ResultSet,
    trxName: String
  ) = {
    this(ctx, 999999999, rs, trxName)
    load(rs)
  }

  def compare[A](
    obj1:                A,
    obj2:                A
  )(implicit comparator: Comparator[A]
  ) = comparator.compare(obj1, obj2)

}
