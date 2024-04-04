/*
 * Copyright 2019 Web3 Labs Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 */
package ir.moke.tron4j.abi.datatypes;

import ir.moke.tron4j.abi.datatypes.primitive.Byte;
import ir.moke.tron4j.abi.datatypes.primitive.Char;
import ir.moke.tron4j.abi.datatypes.primitive.Double;
import ir.moke.tron4j.abi.datatypes.primitive.Float;
import ir.moke.tron4j.abi.datatypes.generated.Bytes1;
import ir.moke.tron4j.abi.datatypes.generated.Bytes10;
import ir.moke.tron4j.abi.datatypes.generated.Bytes11;
import ir.moke.tron4j.abi.datatypes.generated.Bytes12;
import ir.moke.tron4j.abi.datatypes.generated.Bytes13;
import ir.moke.tron4j.abi.datatypes.generated.Bytes14;
import ir.moke.tron4j.abi.datatypes.generated.Bytes15;
import ir.moke.tron4j.abi.datatypes.generated.Bytes16;
import ir.moke.tron4j.abi.datatypes.generated.Bytes17;
import ir.moke.tron4j.abi.datatypes.generated.Bytes18;
import ir.moke.tron4j.abi.datatypes.generated.Bytes19;
import ir.moke.tron4j.abi.datatypes.generated.Bytes2;
import ir.moke.tron4j.abi.datatypes.generated.Bytes20;
import ir.moke.tron4j.abi.datatypes.generated.Bytes21;
import ir.moke.tron4j.abi.datatypes.generated.Bytes22;
import ir.moke.tron4j.abi.datatypes.generated.Bytes23;
import ir.moke.tron4j.abi.datatypes.generated.Bytes24;
import ir.moke.tron4j.abi.datatypes.generated.Bytes25;
import ir.moke.tron4j.abi.datatypes.generated.Bytes26;
import ir.moke.tron4j.abi.datatypes.generated.Bytes27;
import ir.moke.tron4j.abi.datatypes.generated.Bytes28;
import ir.moke.tron4j.abi.datatypes.generated.Bytes29;
import ir.moke.tron4j.abi.datatypes.generated.Bytes3;
import ir.moke.tron4j.abi.datatypes.generated.Bytes30;
import ir.moke.tron4j.abi.datatypes.generated.Bytes31;
import ir.moke.tron4j.abi.datatypes.generated.Bytes32;
import ir.moke.tron4j.abi.datatypes.generated.Bytes4;
import ir.moke.tron4j.abi.datatypes.generated.Bytes5;
import ir.moke.tron4j.abi.datatypes.generated.Bytes6;
import ir.moke.tron4j.abi.datatypes.generated.Bytes7;
import ir.moke.tron4j.abi.datatypes.generated.Bytes8;
import ir.moke.tron4j.abi.datatypes.generated.Bytes9;
import ir.moke.tron4j.abi.datatypes.generated.Int104;
import ir.moke.tron4j.abi.datatypes.generated.Int112;
import ir.moke.tron4j.abi.datatypes.generated.Int120;
import ir.moke.tron4j.abi.datatypes.generated.Int128;
import ir.moke.tron4j.abi.datatypes.generated.Int136;
import ir.moke.tron4j.abi.datatypes.generated.Int144;
import ir.moke.tron4j.abi.datatypes.generated.Int152;
import ir.moke.tron4j.abi.datatypes.generated.Int16;
import ir.moke.tron4j.abi.datatypes.generated.Int160;
import ir.moke.tron4j.abi.datatypes.generated.Int168;
import ir.moke.tron4j.abi.datatypes.generated.Int176;
import ir.moke.tron4j.abi.datatypes.generated.Int184;
import ir.moke.tron4j.abi.datatypes.generated.Int192;
import ir.moke.tron4j.abi.datatypes.generated.Int200;
import ir.moke.tron4j.abi.datatypes.generated.Int208;
import ir.moke.tron4j.abi.datatypes.generated.Int216;
import ir.moke.tron4j.abi.datatypes.generated.Int224;
import ir.moke.tron4j.abi.datatypes.generated.Int232;
import ir.moke.tron4j.abi.datatypes.generated.Int24;
import ir.moke.tron4j.abi.datatypes.generated.Int240;
import ir.moke.tron4j.abi.datatypes.generated.Int248;
import ir.moke.tron4j.abi.datatypes.generated.Int256;
import ir.moke.tron4j.abi.datatypes.generated.Int32;
import ir.moke.tron4j.abi.datatypes.generated.Int40;
import ir.moke.tron4j.abi.datatypes.generated.Int48;
import ir.moke.tron4j.abi.datatypes.generated.Int56;
import ir.moke.tron4j.abi.datatypes.generated.Int64;
import ir.moke.tron4j.abi.datatypes.generated.Int72;
import ir.moke.tron4j.abi.datatypes.generated.Int8;
import ir.moke.tron4j.abi.datatypes.generated.Int80;
import ir.moke.tron4j.abi.datatypes.generated.Int88;
import ir.moke.tron4j.abi.datatypes.generated.Int96;
import ir.moke.tron4j.abi.datatypes.generated.Uint104;
import ir.moke.tron4j.abi.datatypes.generated.Uint112;
import ir.moke.tron4j.abi.datatypes.generated.Uint120;
import ir.moke.tron4j.abi.datatypes.generated.Uint128;
import ir.moke.tron4j.abi.datatypes.generated.Uint136;
import ir.moke.tron4j.abi.datatypes.generated.Uint144;
import ir.moke.tron4j.abi.datatypes.generated.Uint152;
import ir.moke.tron4j.abi.datatypes.generated.Uint16;
import ir.moke.tron4j.abi.datatypes.generated.Uint160;
import ir.moke.tron4j.abi.datatypes.generated.Uint168;
import ir.moke.tron4j.abi.datatypes.generated.Uint176;
import ir.moke.tron4j.abi.datatypes.generated.Uint184;
import ir.moke.tron4j.abi.datatypes.generated.Uint192;
import ir.moke.tron4j.abi.datatypes.generated.Uint200;
import ir.moke.tron4j.abi.datatypes.generated.Uint208;
import ir.moke.tron4j.abi.datatypes.generated.Uint216;
import ir.moke.tron4j.abi.datatypes.generated.Uint224;
import ir.moke.tron4j.abi.datatypes.generated.Uint232;
import ir.moke.tron4j.abi.datatypes.generated.Uint24;
import ir.moke.tron4j.abi.datatypes.generated.Uint240;
import ir.moke.tron4j.abi.datatypes.generated.Uint248;
import ir.moke.tron4j.abi.datatypes.generated.Uint256;
import ir.moke.tron4j.abi.datatypes.generated.Uint32;
import ir.moke.tron4j.abi.datatypes.generated.Uint40;
import ir.moke.tron4j.abi.datatypes.generated.Uint48;
import ir.moke.tron4j.abi.datatypes.generated.Uint56;
import ir.moke.tron4j.abi.datatypes.generated.Uint64;
import ir.moke.tron4j.abi.datatypes.generated.Uint72;
import ir.moke.tron4j.abi.datatypes.generated.Uint8;
import ir.moke.tron4j.abi.datatypes.generated.Uint80;
import ir.moke.tron4j.abi.datatypes.generated.Uint88;
import ir.moke.tron4j.abi.datatypes.generated.Uint96;

/**
 * Maps Solidity types to web3j data types, allowing to use Java primitive types for numbers. The
 * used primitive type is the smallest that can hold a Solidity value for a specific bit length,
 * e.g. {@link java.lang.Short} for <code>int8</code>, <code>int16</code> and <code>uint8</code>;
 * {@link Integer} for <code>int24</code>, <code>int32</code>, <code>uint16</code> and
 * <code>uint24</code>, etc.
 */
public final class AbiTypes {
    private AbiTypes() {}

    /**
     * Returns the web3j data type for the given type, without using primitive types.
     *
     * @param type A Solidity type.
     * @return The web3j Java class to represent this Solidity type.
     */
    public static Class<? extends Type> getType(String type) {
        return getType(type, false);
    }

    /**
     * Returns the web3j data type for the given type.
     *
     * @param type A Solidity type.
     * @param primitives Use Java primitive types to wrap contract parameters.
     * @return The web3j Java class to represent this Solidity type.
     */
    public static Class<? extends Type> getType(String type, boolean primitives) {
        switch (type) {
            case "address":
                return Address.class;
            case "bool":
            case "boolean":
                return Bool.class;
            case "string":
                return Utf8String.class;
            case "bytes":
                return DynamicBytes.class;
            case "byte":
                return Byte.class;
            case "char":
                return Char.class;
            case "double":
                return Double.class;
            case "float":
                return Float.class;
            case "uint":
                return Uint.class;
            case "int":
                return primitives ? ir.moke.tron4j.abi.datatypes.primitive.Int.class : ir.moke.tron4j.abi.datatypes.Int.class;
            case "long":
                return ir.moke.tron4j.abi.datatypes.primitive.Long.class;
            case "short":
                return ir.moke.tron4j.abi.datatypes.primitive.Short.class;
            case "uint8":
                return Uint8.class;
            case "int8":
                return primitives ? ir.moke.tron4j.abi.datatypes.primitive.Short.class : Int8.class;
            case "uint16":
                return primitives ? ir.moke.tron4j.abi.datatypes.primitive.Int.class : Uint16.class;
            case "int16":
                return primitives ? ir.moke.tron4j.abi.datatypes.primitive.Int.class : Int16.class;
            case "uint24":
                return primitives ? ir.moke.tron4j.abi.datatypes.primitive.Int.class : Uint24.class;
            case "int24":
                return primitives ? ir.moke.tron4j.abi.datatypes.primitive.Int.class : Int24.class;
            case "uint32":
                return primitives ? ir.moke.tron4j.abi.datatypes.primitive.Long.class : Uint32.class;
            case "int32":
                return primitives ? ir.moke.tron4j.abi.datatypes.primitive.Int.class : Int32.class;
            case "uint40":
                return primitives ? ir.moke.tron4j.abi.datatypes.primitive.Long.class : Uint40.class;
            case "int40":
                return primitives ? ir.moke.tron4j.abi.datatypes.primitive.Long.class : Int40.class;
            case "uint48":
                return primitives ? ir.moke.tron4j.abi.datatypes.primitive.Long.class : Uint48.class;
            case "int48":
                return primitives ? ir.moke.tron4j.abi.datatypes.primitive.Long.class : Int48.class;
            case "uint56":
                return primitives ? ir.moke.tron4j.abi.datatypes.primitive.Long.class : Uint56.class;
            case "int56":
                return primitives ? ir.moke.tron4j.abi.datatypes.primitive.Long.class : Int56.class;
            case "uint64":
                return Uint64.class;
            case "int64":
                return primitives ? ir.moke.tron4j.abi.datatypes.primitive.Long.class : Int64.class;
            case "uint72":
                return Uint72.class;
            case "int72":
                return Int72.class;
            case "uint80":
                return Uint80.class;
            case "int80":
                return Int80.class;
            case "uint88":
                return Uint88.class;
            case "int88":
                return Int88.class;
            case "uint96":
                return Uint96.class;
            case "int96":
                return Int96.class;
            case "uint104":
                return Uint104.class;
            case "int104":
                return Int104.class;
            case "uint112":
                return Uint112.class;
            case "int112":
                return Int112.class;
            case "uint120":
                return Uint120.class;
            case "int120":
                return Int120.class;
            case "uint128":
                return Uint128.class;
            case "int128":
                return Int128.class;
            case "uint136":
                return Uint136.class;
            case "int136":
                return Int136.class;
            case "uint144":
                return Uint144.class;
            case "int144":
                return Int144.class;
            case "uint152":
                return Uint152.class;
            case "int152":
                return Int152.class;
            case "uint160":
                return Uint160.class;
            case "int160":
                return Int160.class;
            case "uint168":
                return Uint168.class;
            case "int168":
                return Int168.class;
            case "uint176":
                return Uint176.class;
            case "int176":
                return Int176.class;
            case "uint184":
                return Uint184.class;
            case "int184":
                return Int184.class;
            case "uint192":
                return Uint192.class;
            case "int192":
                return Int192.class;
            case "uint200":
                return Uint200.class;
            case "int200":
                return Int200.class;
            case "uint208":
                return Uint208.class;
            case "int208":
                return Int208.class;
            case "uint216":
                return Uint216.class;
            case "int216":
                return Int216.class;
            case "uint224":
                return Uint224.class;
            case "int224":
                return Int224.class;
            case "uint232":
                return Uint232.class;
            case "int232":
                return Int232.class;
            case "uint240":
                return Uint240.class;
            case "int240":
                return Int240.class;
            case "uint248":
                return Uint248.class;
            case "int248":
                return Int248.class;
            case "uint256":
                return Uint256.class;
            case "int256":
                return Int256.class;
            case "bytes1":
                return Bytes1.class;
            case "bytes2":
                return Bytes2.class;
            case "bytes3":
                return Bytes3.class;
            case "bytes4":
                return Bytes4.class;
            case "bytes5":
                return Bytes5.class;
            case "bytes6":
                return Bytes6.class;
            case "bytes7":
                return Bytes7.class;
            case "bytes8":
                return Bytes8.class;
            case "bytes9":
                return Bytes9.class;
            case "bytes10":
                return Bytes10.class;
            case "bytes11":
                return Bytes11.class;
            case "bytes12":
                return Bytes12.class;
            case "bytes13":
                return Bytes13.class;
            case "bytes14":
                return Bytes14.class;
            case "bytes15":
                return Bytes15.class;
            case "bytes16":
                return Bytes16.class;
            case "bytes17":
                return Bytes17.class;
            case "bytes18":
                return Bytes18.class;
            case "bytes19":
                return Bytes19.class;
            case "bytes20":
                return Bytes20.class;
            case "bytes21":
                return Bytes21.class;
            case "bytes22":
                return Bytes22.class;
            case "bytes23":
                return Bytes23.class;
            case "bytes24":
                return Bytes24.class;
            case "bytes25":
                return Bytes25.class;
            case "bytes26":
                return Bytes26.class;
            case "bytes27":
                return Bytes27.class;
            case "bytes28":
                return Bytes28.class;
            case "bytes29":
                return Bytes29.class;
            case "bytes30":
                return Bytes30.class;
            case "bytes31":
                return Bytes31.class;
            case "bytes32":
                return Bytes32.class;
            case "trcToken":
                return TrcToken.class;
            default:
                throw new UnsupportedOperationException("Unsupported type encountered: " + type);
        }
    }

    public static String getTypeAString(Class<? extends Type> type) {
        if (Utf8String.class.equals(type)) {
            return "string";
        } else if (DynamicBytes.class.equals(type)) {
            return "bytes";
        } else {
            return type.getSimpleName().toLowerCase();
        }
    }
}
