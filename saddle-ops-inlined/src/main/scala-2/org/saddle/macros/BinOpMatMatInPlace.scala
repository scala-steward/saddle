package org.saddle.macros

import org.saddle.ops._
import org.saddle.ops.macroImpl.BinOpMatMacros.{matMatIP => make}
import org.saddle.Mat

trait BinOpMatMatInPlace {

  // basic operations
  implicit val matMatIP_DD_Add: BinOpInPlace[Add, Mat[Double], Mat[Double]] = make[Double, Double, Add]
  implicit val matMatIP_DL_Add: BinOpInPlace[Add, Mat[Double], Mat[Long]] = make[Double, Long, Add]
  implicit val matMatIP_DI_Add: BinOpInPlace[Add, Mat[Double], Mat[Int]] = make[Double, Int, Add]
  implicit val matMatIP_LL_Add: BinOpInPlace[Add, Mat[Long], Mat[Long]] = make[Long, Long, Add]
  implicit val matMatIP_LI_Add: BinOpInPlace[Add, Mat[Long], Mat[Int]] = make[Long, Int, Add]
  implicit val matMatIP_II_Add: BinOpInPlace[Add, Mat[Int], Mat[Int]] = make[Int, Int, Add]

  implicit val matMatIP_DD_Power: BinOpInPlace[Power, Mat[Double], Mat[Double]] = make[Double, Double, Power]
  @scala.annotation.nowarn
  implicit val matMatIP_DL_Power: BinOpInPlace[Power, Mat[Double], Mat[Long]] = make[Double, Long, Power]
  implicit val matMatIP_DI_Power: BinOpInPlace[Power, Mat[Double], Mat[Int]] = make[Double, Int, Power]
  @scala.annotation.nowarn
  implicit val matMatIP_LL_Power: BinOpInPlace[Power, Mat[Long], Mat[Long]] = make[Long, Long, Power]
  @scala.annotation.nowarn
  implicit val matMatIP_LI_Power: BinOpInPlace[Power, Mat[Long], Mat[Int]] = make[Long, Int, Power]
  implicit val matMatIP_II_Power: BinOpInPlace[Power, Mat[Int], Mat[Int]] = make[Int, Int, Power]

  implicit val matMatIP_DD_Sub: BinOpInPlace[Subtract, Mat[Double], Mat[Double]] = make[Double, Double, Subtract]
  implicit val matMatIP_DL_Sub: BinOpInPlace[Subtract, Mat[Double], Mat[Long]] = make[Double, Long, Subtract]
  implicit val matMatIP_DI_Sub: BinOpInPlace[Subtract, Mat[Double], Mat[Int]] = make[Double, Int, Subtract]
  implicit val matMatIP_LL_Sub: BinOpInPlace[Subtract, Mat[Long], Mat[Long]] = make[Long, Long, Subtract]
  implicit val matMatIP_LI_Sub: BinOpInPlace[Subtract, Mat[Long], Mat[Int]] = make[Long, Int, Subtract]
  implicit val matMatIP_II_Sub: BinOpInPlace[Subtract, Mat[Int], Mat[Int]] = make[Int, Int, Subtract]

  implicit val matMatIP_DD_Mult: BinOpInPlace[Multiply, Mat[Double], Mat[Double]] = make[Double, Double, Multiply]
  implicit val matMatIP_DL_Mult: BinOpInPlace[Multiply, Mat[Double], Mat[Long]] = make[Double, Long, Multiply]
  implicit val matMatIP_DI_Mult: BinOpInPlace[Multiply, Mat[Double], Mat[Int]] = make[Double, Int, Multiply]
  implicit val matMatIP_LL_Mult: BinOpInPlace[Multiply, Mat[Long], Mat[Long]] = make[Long, Long, Multiply]
  implicit val matMatIP_LI_Mult: BinOpInPlace[Multiply, Mat[Long], Mat[Int]] = make[Long, Int, Multiply]
  implicit val matMatIP_II_Mult: BinOpInPlace[Multiply, Mat[Int], Mat[Int]] = make[Int, Int, Multiply]

  implicit val matMatIP_DD_Div: BinOpInPlace[Divide, Mat[Double], Mat[Double]] = make[Double, Double, Divide]
  implicit val matMatIP_DL_Div: BinOpInPlace[Divide, Mat[Double], Mat[Long]] = make[Double, Long, Divide]
  implicit val matMatIP_DI_Div: BinOpInPlace[Divide, Mat[Double], Mat[Int]] = make[Double, Int, Divide]
  implicit val matMatIP_LL_Div: BinOpInPlace[Divide, Mat[Long], Mat[Long]] = make[Long, Long, Divide]
  implicit val matMatIP_LI_Div: BinOpInPlace[Divide, Mat[Long], Mat[Int]] = make[Long, Int, Divide]
  implicit val matMatIP_II_Div: BinOpInPlace[Divide, Mat[Int], Mat[Int]] = make[Int, Int, Divide]

  implicit val matMatIP_DD_Mod: BinOpInPlace[Mod, Mat[Double], Mat[Double]] = make[Double, Double, Mod]
  implicit val matMatIP_DL_Mod: BinOpInPlace[Mod, Mat[Double], Mat[Long]] = make[Double, Long, Mod]
  implicit val matMatIP_DI_Mod: BinOpInPlace[Mod, Mat[Double], Mat[Int]] = make[Double, Int, Mod]
  implicit val matMatIP_LL_Mod: BinOpInPlace[Mod, Mat[Long], Mat[Long]] = make[Long, Long, Mod]
  implicit val matMatIP_LI_Mod: BinOpInPlace[Mod, Mat[Long], Mat[Int]] = make[Long, Int, Mod]
  implicit val matMatIP_II_Mod: BinOpInPlace[Mod, Mat[Int], Mat[Int]] = make[Int, Int, Mod]

  // bitwise

  implicit val matMatIP_LL_BitAnd: BinOpInPlace[BitAnd, Mat[Long], Mat[Long]] = make[Long, Long, BitAnd]
  implicit val matMatIP_LI_BitAnd: BinOpInPlace[BitAnd, Mat[Long], Mat[Int]] = make[Long, Int, BitAnd]
  implicit val matMatIP_II_BitAnd: BinOpInPlace[BitAnd, Mat[Int], Mat[Int]] = make[Int, Int, BitAnd]

  implicit val matMatIP_LL_BitOr: BinOpInPlace[BitOr, Mat[Long], Mat[Long]] = make[Long, Long, BitOr]
  implicit val matMatIP_LI_BitOr: BinOpInPlace[BitOr, Mat[Long], Mat[Int]] = make[Long, Int, BitOr]
  implicit val matMatIP_II_BitOr: BinOpInPlace[BitOr, Mat[Int], Mat[Int]] = make[Int, Int, BitOr]

  implicit val matMatIP_LL_BitXor: BinOpInPlace[BitXor, Mat[Long], Mat[Long]] = make[Long, Long, BitXor]
  implicit val matMatIP_LI_BitXor: BinOpInPlace[BitXor, Mat[Long], Mat[Int]] = make[Long, Int, BitXor]
  implicit val matMatIP_II_BitXor: BinOpInPlace[BitXor, Mat[Int], Mat[Int]] = make[Int, Int, BitXor]

  implicit val matMatIP_LL_BitShl: BinOpInPlace[BitShl, Mat[Long], Mat[Long]] = make[Long, Long, BitShl]
  implicit val matMatIP_LI_BitShl: BinOpInPlace[BitShl, Mat[Long], Mat[Int]] = make[Long, Int, BitShl]
  implicit val matMatIP_II_BitShl: BinOpInPlace[BitShl, Mat[Int], Mat[Int]] = make[Int, Int, BitShl]

  implicit val matMatIP_LL_BitShr: BinOpInPlace[BitShr, Mat[Long], Mat[Long]] = make[Long, Long, BitShr]
  implicit val matMatIP_LI_BitShr: BinOpInPlace[BitShr, Mat[Long], Mat[Int]] = make[Long, Int, BitShr]
  implicit val matMatIP_II_BitShr: BinOpInPlace[BitShr, Mat[Int], Mat[Int]] = make[Int, Int, BitShr]

  implicit val matMatIP_LL_BitUshr: BinOpInPlace[BitUShr, Mat[Long], Mat[Long]] = make[Long, Long, BitUShr]
  implicit val matMatIP_LI_BitUshr: BinOpInPlace[BitUShr, Mat[Long], Mat[Int]] = make[Long, Int, BitUShr]
  implicit val matMatIP_II_BitUshr: BinOpInPlace[BitUShr, Mat[Int], Mat[Int]] = make[Int, Int, BitUShr]

  // comparison

  implicit val matMatIP_BB_GT: BinOpInPlace[GtOp, Mat[Boolean], Mat[Boolean]] = make[Boolean, Boolean, GtOp]

  implicit val matMatIP_BB_GTE: BinOpInPlace[GteOp, Mat[Boolean], Mat[Boolean]] = make[Boolean, Boolean, GteOp]

  implicit val matMatIP_BB_LT: BinOpInPlace[LtOp, Mat[Boolean], Mat[Boolean]] = make[Boolean, Boolean, LtOp]

  implicit val matMatIP_BB_LTE: BinOpInPlace[LteOp, Mat[Boolean], Mat[Boolean]] = make[Boolean, Boolean, LteOp]

  implicit val matMatIP_BB_NEQ: BinOpInPlace[NeqOp, Mat[Boolean], Mat[Boolean]] = make[Boolean, Boolean, NeqOp]

  implicit val matMatIP_BB_EQ: BinOpInPlace[EqOp, Mat[Boolean], Mat[Boolean]] = make[Boolean, Boolean, EqOp]

  // Boolean
  implicit val matMatIP_BB_And: BinOpInPlace[AndOp, Mat[Boolean], Mat[Boolean]] = make[Boolean, Boolean, AndOp]
  implicit val matMatIP_BB_Or: BinOpInPlace[OrOp, Mat[Boolean], Mat[Boolean]] = make[Boolean, Boolean, OrOp]
  implicit val matMatIP_BB_Xor: BinOpInPlace[XorOp, Mat[Boolean], Mat[Boolean]] = make[Boolean, Boolean, XorOp]

}
