/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * license agreements; and to You under the Apache License, version 2.0:
 *
 *   https://www.apache.org/licenses/LICENSE-2.0
 *
 * This file is part of the Apache Pekko project, derived from Akka.
 */

/*
 * Copyright (C) since 2016 Lightbend Inc. <https://www.lightbend.com>
 */

package org.apache.pekko.stream.connectors.geode

import org.apache.geode.pdx.PdxSerializer

/**
 * Base interface for Geode `PdxSerializer`s in Pekko Connectors Geode.
 */
trait PekkoPdxSerializer[V] extends PdxSerializer {
  def clazz: Class[V]
}
