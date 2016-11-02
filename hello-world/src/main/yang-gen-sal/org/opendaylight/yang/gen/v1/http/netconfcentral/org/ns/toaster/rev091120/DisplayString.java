package org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120;
import java.io.Serializable;
import java.beans.ConstructorProperties;
import com.google.common.base.Preconditions;
import java.util.Objects;


/**
 * YANG version of the SMIv2 DisplayString TEXTUAL-CONVENTION.
 *
 */
public class DisplayString
 implements Serializable {
    private static final long serialVersionUID = -5323910593144881832L;
    private final java.lang.String _value;

    private static void check_valueLength(final String value) {
        final int length = value.length();
        if (length >= 0 && length <= 255) {
            return;
        }
        throw new IllegalArgumentException(String.format("Invalid length: %s, expected: [[0‥255]].", value));
    }

    @ConstructorProperties("value")
    public DisplayString(java.lang.String _value) {
        if (_value != null) {
            check_valueLength(_value);
            }
    
    
        Preconditions.checkNotNull(_value, "Supplied value may not be null");
    
    
        this._value = _value;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public DisplayString(DisplayString source) {
        this._value = source._value;
    }

    public static DisplayString getDefaultInstance(String defaultValue) {
        return new DisplayString(defaultValue);
    }

    public java.lang.String getValue() {
        return _value;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Objects.hashCode(_value);
        return result;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        DisplayString other = (DisplayString) obj;
        if (!Objects.equals(_value, other._value)) {
            return false;
        }
        return true;
    }

    @Override
    public java.lang.String toString() {
        java.lang.StringBuilder builder = new java.lang.StringBuilder(org.opendaylight.yang.gen.v1.http.netconfcentral.org.ns.toaster.rev091120.DisplayString.class.getSimpleName()).append(" [");
        boolean first = true;
    
        if (_value != null) {
            if (first) {
                first = false;
            } else {
                builder.append(", ");
            }
            builder.append("_value=");
            builder.append(_value);
         }
        return builder.append(']').toString();
    }
}

