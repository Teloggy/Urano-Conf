project_name = "heimdal-psicologos"
repo = "https://github.com/Teloggy/Heimdal-Psicologos-Front.git"
repo_name = "heimdal-psicologos"

pipelineJob (project_name){
    definition{
	triggers{
	    scm('0 */2 * * *')
	}
	cpsScm{
	    scm{
		git{    		    
		    remote{
			name(repo_name)
			url(repo)
			refspec(null)
		        credentials('yaher-teloggy-easy')
		    }
		    branches('develop')		    
                }
		scriptPath("Jenkinsfile")
	    }
	}
    }
}