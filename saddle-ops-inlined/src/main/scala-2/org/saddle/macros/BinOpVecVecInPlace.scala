package org.saddle.macros

import org.saddle.ops._
import org.saddle.ops.macroImpl.BinOpVecMacros.{vecVecIP => make}
import org.saddle.Vec 

trait BinOpVecVecInPlace {

  // basic operations
  implicit val vecVecIP_DD_Add: BinOpInPlace[Add, Vec[Double], Vec[Double]] = make[Double, Double, Add]
  implicit val vecVecIP_DL_Add: BinOpInPlace[Add, Vec[Double], Vec[Long]] = make[Double, Long, Add]
  implicit val vecVecIP_DI_Add: BinOpInPlace[Add, Vec[Double], Vec[Int]] = make[Double, Int, Add]
  implicit val vecVecIP_LL_Add: BinOpInPlace[Add, Vec[Long], Vec[Long]] = make[Long, Long, Add]
  implicit val vecVecIP_LI_Add: BinOpInPlace[Add, Vec[Long], Vec[Int]] = make[Long, Int, Add]
  implicit val vecVecIP_II_Add: BinOpInPlace[Add, Vec[Int], Vec[Int]] = make[Int, Int, Add]

  implicit val vecVecIP_DD_Power: BinOpInPlace[Power, Vec[Double], Vec[Double]] = make[Double, Double, Power]
  @scala.annotation.nowarn
  implicit val vecVecIP_DL_Power: BinOpInPlace[Power, Vec[Double], Vec[Long]] = make[Double, Long, Power]
  implicit val vecVecIP_DI_Power: BinOpInPlace[Power, Vec[Double], Vec[Int]] = make[Double, Int, Power]
  @scala.annotation.nowarn
  implicit val vecVecIP_LL_Power: BinOpInPlace[Power, Vec[Long], Vec[Long]] = make[Long, Long, Power]
  @scala.annotation.nowarn
  implicit val vecVecIP_LI_Power: BinOpInPlace[Power, Vec[Long], Vec[Int]] = make[Long, Int, Power]
  implicit val vecVecIP_II_Power: BinOpInPlace[Power, Vec[Int], Vec[Int]] = make[Int, Int, Power]

  implicit val vecVecIP_DD_Sub: BinOpInPlace[Subtract, Vec[Double], Vec[Double]] = make[Double, Double, Subtract]
  implicit val vecVecIP_DL_Sub: BinOpInPlace[Subtract, Vec[Double], Vec[Long]] = make[Double, Long, Subtract]
  implicit val vecVecIP_DI_Sub: BinOpInPlace[Subtract, Vec[Double], Vec[Int]] = make[Double, Int, Subtract]
  implicit val vecVecIP_LL_Sub: BinOpInPlace[Subtract, Vec[Long], Vec[Long]] = make[Long, Long, Subtract]
  implicit val vecVecIP_LI_Sub: BinOpInPlace[Subtract, Vec[Long], Vec[Int]] = make[Long, Int, Subtract]
  implicit val vecVecIP_II_Sub: BinOpInPlace[Subtract, Vec[Int], Vec[Int]] = make[Int, Int, Subtract]

  implicit val vecVecIP_DD_Mult: BinOpInPlace[Multiply, Vec[Double], Vec[Double]] = make[Double, Double, Multiply]
  implicit val vecVecIP_DL_Mult: BinOpInPlace[Multiply, Vec[Double], Vec[Long]] = make[Double, Long, Multiply]
  implicit val vecVecIP_DI_Mult: BinOpInPlace[Multiply, Vec[Double], Vec[Int]] = make[Double, Int, Multiply]
  implicit val vecVecIP_LL_Mult: BinOpInPlace[Multiply, Vec[Long], Vec[Long]] = make[Long, Long, Multiply]
  implicit val vecVecIP_LI_Mult: BinOpInPlace[Multiply, Vec[Long], Vec[Int]] = make[Long, Int, Multiply]
  implicit val vecVecIP_II_Mult: BinOpInPlace[Multiply, Vec[Int], Vec[Int]] = make[Int, Int, Multiply]

  implicit val vecVecIP_DD_Div: BinOpInPlace[Divide, Vec[Double], Vec[Double]] = make[Double, Double, Divide]
  implicit val vecVecIP_DL_Div: BinOpInPlace[Divide, Vec[Double], Vec[Long]] = make[Double, Long, Divide]
  implicit val vecVecIP_DI_Div: BinOpInPlace[Divide, Vec[Double], Vec[Int]] = make[Double, Int, Divide]
  implicit val vecVecIP_LL_Div: BinOpInPlace[Divide, Vec[Long], Vec[Long]] = make[Long, Long, Divide]
  implicit val vecVecIP_LI_Div: BinOpInPlace[Divide, Vec[Long], Vec[Int]] = make[Long, Int, Divide]
  implicit val vecVecIP_II_Div: BinOpInPlace[Divide, Vec[Int], Vec[Int]] = make[Int, Int, Divide]

  implicit val vecVecIP_DD_Mod: BinOpInPlace[Mod, Vec[Double], Vec[Double]] = make[Double, Double, Mod]
  implicit val vecVecIP_DL_Mod: BinOpInPlace[Mod, Vec[Double], Vec[Long]] = make[Double, Long, Mod]
  implicit val vecVecIP_DI_Mod: BinOpInPlace[Mod, Vec[Double], Vec[Int]] = make[Double, Int, Mod]
  implicit val vecVecIP_LL_Mod: BinOpInPlace[Mod, Vec[Long], Vec[Long]] = make[Long, Long, Mod]
  implicit val vecVecIP_LI_Mod: BinOpInPlace[Mod, Vec[Long], Vec[Int]] = make[Long, Int, Mod]
  implicit val vecVecIP_II_Mod: BinOpInPlace[Mod, Vec[Int], Vec[Int]] = make[Int, Int, Mod]

  // bitwise

  implicit val vecVecIP_LL_BitAnd: BinOpInPlace[BitAnd, Vec[Long], Vec[Long]] = make[Long, Long, BitAnd]
  implicit val vecVecIP_LI_BitAnd: BinOpInPlace[BitAnd, Vec[Long], Vec[Int]] = make[Long, Int, BitAnd]
  implicit val vecVecIP_II_BitAnd: BinOpInPlace[BitAnd, Vec[Int], Vec[Int]] = make[Int, Int, BitAnd]

  implicit val vecVecIP_LL_BitOr: BinOpInPlace[BitOr, Vec[Long], Vec[Long]] = make[Long, Long, BitOr]
  implicit val vecVecIP_LI_BitOr: BinOpInPlace[BitOr, Vec[Long], Vec[Int]] = make[Long, Int, BitOr]
  implicit val vecVecIP_II_BitOr: BinOpInPlace[BitOr, Vec[Int], Vec[Int]] = make[Int, Int, BitOr]

  implicit val vecVecIP_LL_BitXor: BinOpInPlace[BitXor, Vec[Long], Vec[Long]] = make[Long, Long, BitXor]
  implicit val vecVecIP_LI_BitXor: BinOpInPlace[BitXor, Vec[Long], Vec[Int]] = make[Long, Int, BitXor]
  implicit val vecVecIP_II_BitXor: BinOpInPlace[BitXor, Vec[Int], Vec[Int]] = make[Int, Int, BitXor]

  implicit val vecVecIP_LL_BitShl: BinOpInPlace[BitShl, Vec[Long], Vec[Long]] = make[Long, Long, BitShl]
  implicit val vecVecIP_LI_BitShl: BinOpInPlace[BitShl, Vec[Long], Vec[Int]] = make[Long, Int, BitShl]
  implicit val vecVecIP_II_BitShl: BinOpInPlace[BitShl, Vec[Int], Vec[Int]] = make[Int, Int, BitShl]

  implicit val vecVecIP_LL_BitShr: BinOpInPlace[BitShr, Vec[Long], Vec[Long]] = make[Long, Long, BitShr]
  implicit val vecVecIP_LI_BitShr: BinOpInPlace[BitShr, Vec[Long], Vec[Int]] = make[Long, Int, BitShr]
  implicit val vecVecIP_II_BitShr: BinOpInPlace[BitShr, Vec[Int], Vec[Int]] = make[Int, Int, BitShr]

  implicit val vecVecIP_LL_BitUshr: BinOpInPlace[BitUShr, Vec[Long], Vec[Long]] = make[Long, Long, BitUShr]
  implicit val vecVecIP_LI_BitUshr: BinOpInPlace[BitUShr, Vec[Long], Vec[Int]] = make[Long, Int, BitUShr]
  implicit val vecVecIP_II_BitUshr: BinOpInPlace[BitUShr, Vec[Int], Vec[Int]] = make[Int, Int, BitUShr]

  // comparison

  implicit val vecVecIP_BB_GT: BinOpInPlace[GtOp, Vec[Boolean], Vec[Boolean]] = make[Boolean, Boolean, GtOp]

  implicit val vecVecIP_BB_GTE: BinOpInPlace[GteOp, Vec[Boolean], Vec[Boolean]] = make[Boolean, Boolean, GteOp]

  implicit val vecVecIP_BB_LT: BinOpInPlace[LtOp, Vec[Boolean], Vec[Boolean]] = make[Boolean, Boolean, LtOp]

  implicit val vecVecIP_BB_LTE: BinOpInPlace[LteOp, Vec[Boolean], Vec[Boolean]] = make[Boolean, Boolean, LteOp]

  implicit val vecVecIP_BB_NEQ: BinOpInPlace[NeqOp, Vec[Boolean], Vec[Boolean]] = make[Boolean, Boolean, NeqOp]

  implicit val vecVecIP_BB_EQ: BinOpInPlace[EqOp, Vec[Boolean], Vec[Boolean]] = make[Boolean, Boolean, EqOp]

  // Boolean
  implicit val vecVec_BB_And: BinOpInPlace[AndOp, Vec[Boolean], Vec[Boolean]] = make[Boolean, Boolean, AndOp]
  implicit val vecVec_BB_Or: BinOpInPlace[OrOp, Vec[Boolean], Vec[Boolean]] = make[Boolean, Boolean, OrOp]
  implicit val vecVec_BB_Xor: BinOpInPlace[XorOp, Vec[Boolean], Vec[Boolean]] = make[Boolean, Boolean, XorOp]

}
