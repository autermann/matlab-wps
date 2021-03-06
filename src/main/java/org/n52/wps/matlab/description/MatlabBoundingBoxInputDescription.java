/*
 * Copyright (C) 2013 Christian Autermann
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */
package org.n52.wps.matlab.description;

import org.n52.matlab.connector.value.MatlabType;
import org.n52.wps.io.data.IData;
import org.n52.wps.io.data.binding.bbox.BoundingBoxData;

import com.github.autermann.wps.commons.description.impl.AbstractBoundingBoxInputDescriptionBuilder;
import com.github.autermann.wps.commons.description.impl.BoundingBoxInputDescriptionImpl;

public class MatlabBoundingBoxInputDescription extends BoundingBoxInputDescriptionImpl
        implements MatlabProcessInputDescription {

    public MatlabBoundingBoxInputDescription(AbstractBoundingBoxInputDescriptionBuilder<?, ?> builder) {
        super(builder);
    }

    @Override
    public MatlabType getMatlabType() {
        return MatlabType.MATRIX;
    }

    @Override
    public Class<? extends IData> getBindingClass() {
        return BoundingBoxData.class;
    }

    public static AbstractBoundingBoxInputDescriptionBuilder<?, ?> builder() {
        return new BuilderImpl();
    }

    private static class BuilderImpl extends AbstractBoundingBoxInputDescriptionBuilder<MatlabBoundingBoxInputDescription, BuilderImpl> {
        @Override
        public MatlabBoundingBoxInputDescription build() {
            return new MatlabBoundingBoxInputDescription(this);
        }
    }
}
