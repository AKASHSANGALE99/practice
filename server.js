import express from 'express'
import path from 'path'

let app=express()
app.get('/',(req,res)=>{
    res.sendFile(path.join(_dirname+'/ageCalculator.html'))
})
app.listen(3000,()=>{console.log("3000")})