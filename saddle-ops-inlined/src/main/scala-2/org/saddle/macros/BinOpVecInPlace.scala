package org.saddle.macros

import org.saddle.ops._
import org.saddle.ops.macroImpl.BinOpVecMacros.{
  vecScalarElementwiseIP => VecSclrIP
}
import org.saddle.Vec 

trait BinOpVecInPlace {

  // basic operations
  implicit val vecSclr_DD_Add: BinOpInPlace[Add, Vec[Double], Double] = VecSclrIP[Double, Double, Add]
  implicit val vecSclr_DL_Add: BinOpInPlace[Add, Vec[Double], Long] = VecSclrIP[Double, Long, Add]
  implicit val vecSclr_DI_Add: BinOpInPlace[Add, Vec[Double], Int] = VecSclrIP[Double, Int, Add]
  implicit val vecSclr_LL_Add: BinOpInPlace[Add, Vec[Long], Long] = VecSclrIP[Long, Long, Add]
  implicit val vecSclr_LI_Add: BinOpInPlace[Add, Vec[Long], Int] = VecSclrIP[Long, Int, Add]
  implicit val vecSclr_II_Add: BinOpInPlace[Add, Vec[Int], Int] = VecSclrIP[Int, Int, Add]

  implicit val vecSclr_DD_Power: BinOpInPlace[Power, Vec[Double], Double] = VecSclrIP[Double, Double, Power]
  @scala.annotation.nowarn
  implicit val vecSclr_DL_Power: BinOpInPlace[Power, Vec[Double], Long] = VecSclrIP[Double, Long, Power]
  implicit val vecSclr_DI_Power: BinOpInPlace[Power, Vec[Double], Int] = VecSclrIP[Double, Int, Power]
  @scala.annotation.nowarn
  implicit val vecSclr_LL_Power: BinOpInPlace[Power, Vec[Long], Long] = VecSclrIP[Long, Long, Power]
  @scala.annotation.nowarn
  implicit val vecSclr_LI_Power: BinOpInPlace[Power, Vec[Long], Int] = VecSclrIP[Long, Int, Power]
  implicit val vecSclr_II_Power: BinOpInPlace[Power, Vec[Int], Int] = VecSclrIP[Int, Int, Power]

  implicit val vecSclr_DD_Sub: BinOpInPlace[Subtract, Vec[Double], Double] = VecSclrIP[Double, Double, Subtract]
  implicit val vecSclr_DL_Sub: BinOpInPlace[Subtract, Vec[Double], Long] = VecSclrIP[Double, Long, Subtract]
  implicit val vecSclr_DI_Sub: BinOpInPlace[Subtract, Vec[Double], Int] = VecSclrIP[Double, Int, Subtract]
  implicit val vecSclr_LL_Sub: BinOpInPlace[Subtract, Vec[Long], Long] = VecSclrIP[Long, Long, Subtract]
  implicit val vecSclr_LI_Sub: BinOpInPlace[Subtract, Vec[Long], Int] = VecSclrIP[Long, Int, Subtract]
  implicit val vecSclr_II_Sub: BinOpInPlace[Subtract, Vec[Int], Int] = VecSclrIP[Int, Int, Subtract]

  implicit val vecSclr_DD_Mult: BinOpInPlace[Multiply, Vec[Double], Double] = VecSclrIP[Double, Double, Multiply]
  implicit val vecSclr_DL_Mult: BinOpInPlace[Multiply, Vec[Double], Long] = VecSclrIP[Double, Long, Multiply]
  implicit val vecSclr_DI_Mult: BinOpInPlace[Multiply, Vec[Double], Int] = VecSclrIP[Double, Int, Multiply]
  implicit val vecSclr_LL_Mult: BinOpInPlace[Multiply, Vec[Long], Long] = VecSclrIP[Long, Long, Multiply]
  implicit val vecSclr_LI_Mult: BinOpInPlace[Multiply, Vec[Long], Int] = VecSclrIP[Long, Int, Multiply]
  implicit val vecSclr_II_Mult: BinOpInPlace[Multiply, Vec[Int], Int] = VecSclrIP[Int, Int, Multiply]

  implicit val vecSclr_DD_Div: BinOpInPlace[Divide, Vec[Double], Double] = VecSclrIP[Double, Double, Divide]
  implicit val vecSclr_DL_Div: BinOpInPlace[Divide, Vec[Double], Long] = VecSclrIP[Double, Long, Divide]
  implicit val vecSclr_DI_Div: BinOpInPlace[Divide, Vec[Double], Int] = VecSclrIP[Double, Int, Divide]
  implicit val vecSclr_LL_Div: BinOpInPlace[Divide, Vec[Long], Long] = VecSclrIP[Long, Long, Divide]
  implicit val vecSclr_LI_Div: BinOpInPlace[Divide, Vec[Long], Int] = VecSclrIP[Long, Int, Divide]
  implicit val vecSclr_II_Div: BinOpInPlace[Divide, Vec[Int], Int] = VecSclrIP[Int, Int, Divide]

  implicit val vecSclr_DD_Mod: BinOpInPlace[Mod, Vec[Double], Double] = VecSclrIP[Double, Double, Mod]
  implicit val vecSclr_DL_Mod: BinOpInPlace[Mod, Vec[Double], Long] = VecSclrIP[Double, Long, Mod]
  implicit val vecSclr_DI_Mod: BinOpInPlace[Mod, Vec[Double], Int] = VecSclrIP[Double, Int, Mod]
  implicit val vecSclr_LL_Mod: BinOpInPlace[Mod, Vec[Long], Long] = VecSclrIP[Long, Long, Mod]
  implicit val vecSclr_LI_Mod: BinOpInPlace[Mod, Vec[Long], Int] = VecSclrIP[Long, Int, Mod]
  implicit val vecSclr_II_Mod: BinOpInPlace[Mod, Vec[Int], Int] = VecSclrIP[Int, Int, Mod]

  // bitwise

  implicit val vecSclr_LL_BitAnd: BinOpInPlace[BitAnd, Vec[Long], Long] = VecSclrIP[Long, Long, BitAnd]
  implicit val vecSclr_LI_BitAnd: BinOpInPlace[BitAnd, Vec[Long], Int] = VecSclrIP[Long, Int, BitAnd]
  implicit val vecSclr_II_BitAnd: BinOpInPlace[BitAnd, Vec[Int], Int] = VecSclrIP[Int, Int, BitAnd]

  implicit val vecSclr_LL_BitOr: BinOpInPlace[BitOr, Vec[Long], Long] = VecSclrIP[Long, Long, BitOr]
  implicit val vecSclr_LI_BitOr: BinOpInPlace[BitOr, Vec[Long], Int] = VecSclrIP[Long, Int, BitOr]
  implicit val vecSclr_II_BitOr: BinOpInPlace[BitOr, Vec[Int], Int] = VecSclrIP[Int, Int, BitOr]

  implicit val vecSclr_LL_BitXor: BinOpInPlace[BitXor, Vec[Long], Long] = VecSclrIP[Long, Long, BitXor]
  implicit val vecSclr_LI_BitXor: BinOpInPlace[BitXor, Vec[Long], Int] = VecSclrIP[Long, Int, BitXor]
  implicit val vecSclr_II_BitXor: BinOpInPlace[BitXor, Vec[Int], Int] = VecSclrIP[Int, Int, BitXor]

  implicit val vecSclr_LL_BitShl: BinOpInPlace[BitShl, Vec[Long], Long] = VecSclrIP[Long, Long, BitShl]
  implicit val vecSclr_LI_BitShl: BinOpInPlace[BitShl, Vec[Long], Int] = VecSclrIP[Long, Int, BitShl]
  implicit val vecSclr_II_BitShl: BinOpInPlace[BitShl, Vec[Int], Int] = VecSclrIP[Int, Int, BitShl]

  implicit val vecSclr_LL_BitShr: BinOpInPlace[BitShr, Vec[Long], Long] = VecSclrIP[Long, Long, BitShr]
  implicit val vecSclr_LI_BitShr: BinOpInPlace[BitShr, Vec[Long], Int] = VecSclrIP[Long, Int, BitShr]
  implicit val vecSclr_II_BitShr: BinOpInPlace[BitShr, Vec[Int], Int] = VecSclrIP[Int, Int, BitShr]

  implicit val vecSclr_LL_BitUshr: BinOpInPlace[BitUShr, Vec[Long], Long] = VecSclrIP[Long, Long, BitUShr]
  implicit val vecSclr_LI_BitUshr: BinOpInPlace[BitUShr, Vec[Long], Int] = VecSclrIP[Long, Int, BitUShr]
  implicit val vecSclr_II_BitUshr: BinOpInPlace[BitUShr, Vec[Int], Int] = VecSclrIP[Int, Int, BitUShr]

  // comparison

  implicit val vecSclr_BB_GT: BinOpInPlace[GtOp, Vec[Boolean], Boolean] = VecSclrIP[Boolean, Boolean, GtOp]

  implicit val vecSclr_BB_GTE: BinOpInPlace[GteOp, Vec[Boolean], Boolean] = VecSclrIP[Boolean, Boolean, GteOp]

  implicit val vecSclr_BB_LT: BinOpInPlace[LtOp, Vec[Boolean], Boolean] = VecSclrIP[Boolean, Boolean, LtOp]

  implicit val vecSclr_BB_LTE: BinOpInPlace[LteOp, Vec[Boolean], Boolean] = VecSclrIP[Boolean, Boolean, LteOp]

  implicit val vecSclr_BB_NEQ: BinOpInPlace[NeqOp, Vec[Boolean], Boolean] = VecSclrIP[Boolean, Boolean, NeqOp]

  implicit val vecSclr_BB_EQ: BinOpInPlace[EqOp, Vec[Boolean], Boolean] = VecSclrIP[Boolean, Boolean, EqOp]

  // Boolean
  implicit val vecSclr_BB_And: BinOpInPlace[AndOp, Vec[Boolean], Boolean] = VecSclrIP[Boolean, Boolean, AndOp]
  implicit val vecSclr_BB_Or: BinOpInPlace[OrOp, Vec[Boolean], Boolean] = VecSclrIP[Boolean, Boolean, OrOp]
  implicit val vecSclr_BB_Xor: BinOpInPlace[XorOp, Vec[Boolean], Boolean] = VecSclrIP[Boolean, Boolean, XorOp]

}
