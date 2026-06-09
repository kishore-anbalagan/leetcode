import pandas as pd

def selectData(student: pd.DataFrame) -> pd.DataFrame:
    return student.loc[student["student_id"]==101,["name","age"]]
    